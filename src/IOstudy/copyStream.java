package IOstudy;

import sun.applet.Main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyStream {
    public static void main(String[] args) throws IOException {
        //输入流，输入到计算机
        FileInputStream scr = new FileInputStream("test.txt");
        //输出流，从计算机输出到它里面

        FileOutputStream des =new FileOutputStream("fos.txt");

        int len = -1;
        byte[] data =new byte[1024*10];
        while ((len = scr.read(data))!=-1){
            des.write(data,0,len);
        }

        System.out.println("复制完毕");
      scr.close();
      des.close();

    }
}
