package file;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class upDateNickName {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        boolean flag =false;//开关，判断是否更改
        String username =scanner.nextLine();
        System.out.println("请输入新昵称");
        String nickname =scanner.nextLine();
        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        for(int i=0;i<raf.length();i++){
            raf.seek(i*100);
            byte[] data = new byte[32];
            raf.read(data);
            String name = new String(data,"utf-8").trim();
            if(name.equals(username)){
                /*修改昵称*/
                raf.seek(i*100+54);
                data = nickname.getBytes("utf-8");
                data = Arrays.copyOf(data,32);
                raf.write(data);
                System.out.println("修改完毕");
                flag = true;
                break;

            }

        }
        if(!flag){
            System.out.println("查无此人");
        }


        raf.close();

    }
}
