package day04;
import java.util.Scanner;
public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        System.out.println("年龄为:" + age);
        double price = scanner.nextDouble();
        System.out.println("价格为：" + price );
    }


}
