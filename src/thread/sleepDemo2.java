package thread;

import java.util.Scanner;

/**倒计时程序*/
public class sleepDemo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        String line = scanner.nextLine();

        Integer num = Integer.parseInt(line);
        for (; num > 0; num--) {
            System.out.println(num);
            try {
                Thread.sleep(3000);
                System.out.println("你好");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}