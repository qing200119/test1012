package day04;

public class WhileDemo {
    public static void main(String[] args) {
        int times =0;//初始化
        while(times<5){//循环条件

            times++;//变量改变
            if(times==2)
            {
                continue;
            }
            System.out.println("加油！");
        }
        System.out.println("继续");
        /*
        break 跳出循环
        continue 跳出当前循环
         */
    }
}
