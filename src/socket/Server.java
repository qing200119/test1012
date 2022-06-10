package socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/***
 *ServerSocket 向系统申请端口，客户端通过这个端口与服务器建立连接
 *监听端口，当客户端通过端口与服务器建立连接时会自动创建一个socket，通过这个
 * Socket与客户端进行数据交互
 * */
public class Server {
    private ServerSocket server;
    /*该数组保存 ClientRunnable内部所有对应客户端的输出流，
    以便广播信息，内部类可以访问外部类
    所有的ClientRunnable 都可以看到它，这样这些ClientRunnable 可以共享数据
    * */
    //private PrintWriter[] allOut = {};

    Collection<PrintWriter> allOut = new ArrayList<PrintWriter>();


    public Server() {
        try {
            /*该端口不能与系统用的端口相同
             * */
            server = new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start() {

        try {
            /** server.accept();阻塞，等待客户端连接
             * 当客户端尝试连接时，accept会返回一个Socket，通过Socket
             * 既可以和建立连接的客户端交互
             *
             * */

            while (true) {
                System.out.println("等待客户端连接");
                Socket socket = server.accept();
                System.out.println("一个客户端连接");
                //启动一个线程处理客户端
                ClientRunnable client = new ClientRunnable(socket);
                Thread t = new Thread(client);
                t.start();

            }
            /**通 过socket获取输入流，读取客户端发送过来的数据
             * */


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Server server = new Server();
        System.out.println("正在启动服务器");
        server.start();
    }
    /*指定任务socket对应客户端进行交互*/
    private class ClientRunnable implements Runnable {
        private final Socket socket;
        private  String host;
        public ClientRunnable(Socket socket) {
            this.socket = socket;
            /*通过socket获取信息
            * 获取远端客户端信息,
            * 获取IP地址*/
         InetAddress address = socket.getInetAddress();//实例
        host = address.getHostAddress();


        }
        @Override
        public void run() {
            System.out.println("启用一个处理线程");
            PrintWriter pw=null;
            try {
                InputStream ins = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(ins, "utf-8");
                BufferedReader br = new BufferedReader(isr);
                /**作为客户端发消息
                 *
                 * */
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw, true);
                /*将当前ClientRunnable对应的客户端的输出流放到对应数组中*/
                synchronized (allOut) {
                    allOut.add(pw);
                }
                //先对allout数组扩容，将pw放入数组的最后一个位置上
                String message = null;
                while ((message = br.readLine()) != null) {
                    System.out.println(host+"客户端speak: " + message);
                    //pw.println("客户端：" + message);
                    //遍历操作和其他对数组的操作要互斥
                    synchronized (allOut) {
                        for (PrintWriter o: allOut) {
                            o.println(host+"客户端说" + message);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {

                synchronized (allOut) {
                   /*删除元素
                   for (int i = 0; i < allOut.length; i++) {
                        if (allOut[i]==pw) {
                            allOut[i] = allOut[allOut.length - 1];
                            allOut = Arrays.copyOf(allOut, allOut.length - 1);//缩容
                            break;
                        }
                    }*/
            allOut.remove(pw);
                }

                /*处理客户端断开后的操作，将socket关闭*/
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}