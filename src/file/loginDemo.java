package file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;
import  java.lang.Integer;

public class loginDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        raf.seek(raf.length());
        System.out.println("欢迎注册");
        Scanner scanner= new Scanner(System.in);
        System.out.println("s输入用户名");
        String name =scanner.nextLine();
        System.out.println("输入用户密码");
        String password = scanner.nextLine();
        System.out.println("输入昵称");
        String nc = scanner.nextLine();
        System.out.println("输入年龄");
        System.out.println();
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println(name+","+password+","+nc+","+age);

        byte[] data = name.getBytes("utf-8");
        data = Arrays.copyOf(data,32);//扩容为32字节
        raf.write(data);

        data = password.getBytes("utf-8");
        data =Arrays.copyOf(data,32);
        raf.write(data);
        data = nc.getBytes("utf-8");
        data =Arrays.copyOf(data,32);
        raf.write(data);

        raf.writeInt(age);
        System.out.println("注册完毕");

        raf.close();


    }
}
