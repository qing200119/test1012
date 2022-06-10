package IOstudy;
/* FileOutputStream 文件输出流
* flush()将缓冲流里面的数据强制输出
* close中会调用一次flush
* BufferedOutputStream字节输出缓冲流
*
* */
import java.io.*;

public class BufferDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("fos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String line = "天梯天啊沙发上课";
        byte[] data = line.getBytes("utf-8");
        bos.write(data);
        //bos.flush();
        System.out.println("写好了");
       bos.close();
       fos.close();
    }
}
