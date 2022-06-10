package file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class rafDemoVr {
    public static void main(String[] args) throws IOException {
        int max = Integer.MAX_VALUE;
        RandomAccessFile raf  =new RandomAccessFile("raf.dat1","rw");




        raf.write(max>>>24);
        System.out.println(raf.getFilePointer());
        raf.write(max>>>16);
        System.out.println(raf.getFilePointer());
        raf.write(max>>>8);
        System.out.println(raf.getFilePointer());

        /*
        * void writeInt(int d)
        * 连续写出4个字节，将给定的int值写出
        * */

        raf.writeInt(max);
        System.out.println(raf.getFilePointer());//读出字节位置

       //移动值指针位置
       raf.seek(0);

        int d =raf.read();
        System.out.println(d);

        System.out.println("写好了");
        raf.close();



    }
}
