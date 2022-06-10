package IOstudy;
/*
* 当刘链接中创建printWriter是
* 允许指定第二个参数，改参数为一个boolean值，当这个值为TRUE时
* 为自动刷新行功能，即自动调用flush
*
*
*
* */
import java.io.*;
import java.util.Scanner;

public class testDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名");
        String filename = scanner.nextLine();
        FileOutputStream fos = new FileOutputStream(filename);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);
        System.out.println("please input your words");

        String line = null;
        while (true){
            line = scanner.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.println(line);
            //pw.flush();
        }
        System.out.println("over");
        pw.close();

    }
}
