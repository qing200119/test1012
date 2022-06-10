package day04;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "请输入工呢功能 1：存款  2：取款 3：查询余额");
       int command = scan.nextInt();
       switch (command){
           case 1:
               System.out.println("存款操作");
               break;
           case 2:
               System.out.println("取款操作");
               break;
           case 3:
               System.out.println("查询余额操作");
               break;
           case 0:
               System.out.println("退出操作");
               break;
           default:
               System.out.println("输入错误");
       }









        /*
        switch 效率高，结构清晰
        缺点：只能对整数来判断相等
        和break配着用数据类型 byte  short int char (long 不能用）
        case 后面的数不能重复
        switch

        int number=1;
        switch (number)
        {
            case 1:
                System.out.println("1111");
                break;//跳出Switch
            case 2:
                System.out.println("2222");
            case 3:
                System.out.println("3333");
            default:
                System.out.println("6666");

        }
*/

    }
}
