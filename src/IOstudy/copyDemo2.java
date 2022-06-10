package IOstudy;

import java.io.*;

/**缓冲流
 *
 *
 *
* */
public class copyDemo2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("music1.mp3");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("music2.mp3");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long t = System.currentTimeMillis();
        int len = -1;
        t = System.currentTimeMillis()-t;
        while ((len = bis.read())!=-1)
        {
            bos.write(len);
        }
        System.out.println("用时"+t);
        fis.close();
        fos.close();

    }
}
