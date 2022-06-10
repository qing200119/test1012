package file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class test {

    public static void main(String[] args) throws IOException {
        System.out.println("请输入文件名");
        Scanner scan = new Scanner(System.in);
        String  filename = scan.nextLine();
        RandomAccessFile raf = new RandomAccessFile(filename,"rw");
        System.out.println("请输入内容");
        String line ="";
        while (true)
        {
            line = scan.nextLine();
            if("exit".equals(line)){
                break;
            }
            raf.write(line.getBytes("utf-8"));
        }
        System.out.println("再见");
        raf.close();

    }


}
