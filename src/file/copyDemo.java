package file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class copyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
        RandomAccessFile raf1 = new RandomAccessFile("raf.dat", "rw");





      /*RAF提供块读写
      * void write（byte[] data)
      *
      *
      *
      * int read(byte[] data)   一次性读出给定字节数    * */
      /*int len = -1;
      long t = System.currentTimeMillis();
      byte[] data = new byte[10*1024];//10kb
        while ((len =raf.read(data))!=-1){
            raf1.write(data);
        }
    t = System.currentTimeMillis()-t;
        System.out.println("复制时间"+t);*/
    raf.close();
    raf1.close();




        /*单个读*/
        /* int d = -1;
      while ((d = raf.read())!= -1){
          raf1.write(d);
      }
        System.out.println("复制完毕");
      raf.close();
      raf1.close();


      */
    }
}
