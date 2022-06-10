package socket;
/**
 * 套接字
 * java。net.Socket
 * socket封装了TCP的通讯细节
 * 过程抽象为通过两个流完成与远端计算机数据交换
 */

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket socket;

    /**用构造方法初始化
     谁发起连接就是客户端
     通过IP地址找到服务端计算机地址
     通过端口找到应用程序端口，
     客户端IP和端口无需指定
     实例化socket 的过程，就是发起连接的过程
     若服务器没有响应则直接抛出异常
     本机127.0.0.1或；localhost
     * */
    public Client() {
        try {
            System.out.println("正在连接");
            socket = new Socket("localhost", 8088);//第一个参数ip 地址，第二个参数dua端口号
            System.out.println("已经连接");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*开始方法*/
    public void start() {
        try {

            //启动一个线程用来读消息
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);//启动线程读handler
            t.start();
            /*通过输出流，数据最终发送给服务器
             * *
             * */
            OutputStream out = socket.getOutputStream();//调用字节流
            OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String str = scanner.nextLine();
                pw.println(str);
                //读取发送的字符串
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

public class  ServerHandler implements Runnable{
    @Override
    public void run() {
        try {

            //通过读入流，不断读消息
            InputStream ins = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(ins, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String  line =null;
            while ((line= br.readLine())!=null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


}
