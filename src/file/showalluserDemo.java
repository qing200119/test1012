package file;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class showalluserDemo {
    public static void main(String[] args) throws IOException {
        /*循环读取所有字节*/
        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        for(int i=0;i<raf.length()/100;i++){
            byte[] data = new byte[32];
            raf.read(data);
            String name = new String(data,"utf-8").trim();
            raf.read(data);
            String password = new String(data,"utf-8");

            raf.read(data);
            String nickName = new String(data,"utf-8");

              int age = raf.readInt();
            System.out.println(name+","+password +","+nickName+","+age);

        }
     raf.close();

    }
}
