package IOstudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* 字符转换流 InputStreamReader
*
* */
public class isrDemo {
    public static void main(String[] args) throws IOException {

       // FileOutputStream fos =new FileOutputStream("osw.txt");

        FileInputStream fis =new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
       /* int d =-1;
        while ((d=isr.read())!=-1){
           *//* char c= (char)d;//只能是两个字节

            System.out.println(c);*//*


        }*/
        char[] data =new char[100];//一次100个字符
        int len =isr.read(data);
        String str = new String(data,0,len+2);
        System.out.println(str);
        isr.close();
    }

}
