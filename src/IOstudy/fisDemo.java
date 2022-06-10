package IOstudy;

import java.io.FileInputStream;
import java.io.IOException;

public class fisDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        byte[] data = new byte[200];
        int len = fis.read(data);
        System.out.println("实际读了"+len);
        String str = new String(data,0,len,"utf-8");
        System.out.println(str);
        fis.close();
    }
}
