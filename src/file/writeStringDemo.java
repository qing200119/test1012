package file;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
* 1)字符串转化为二进制
*
*
* */
public class writeStringDemo {

    public static void main(String[] args) throws IOException {


        /*读字符串
        *
        * */
        /*RandomAccessFile raf = new RandomAccessFile("test.txt","rw");
        byte[] data = new byte[(int)raf.length()];
        raf.read(data);
        String str = new String(data,"utf-8");
        System.out.println(str);
        raf.close();
*/






       /* RandomAccessFile raf = new RandomAccessFile("test.txt","rw");
        String line = "大家伙，我是LIMing";
        *//*字符串转字节
        * byte[] =getBytes();*//*
        byte[] data = line.getBytes("UTF-8");
        raf.write(data);
        System.out.println("写完毕");
        raf.close();*/

    }
}
