package day02;
//变量的演示，变量的例子
public class VarDemo {
    public static void main(String[] args) {
        //1)变量的声明
        int a = 5;//声明一个整型的变量，名为a
        System.out.println(a);
        int b,c,d;//只声明不使用就输出会报错
        //2)变量初始化
        int e = 250;//声明变量并赋值
        int f;
        f = 250;//先声明变量，再赋值，变量不能同名
        //3)变量的使用，使用的是账户里面的值
        b = a + 10;
        System.out.println(b);//不加引号是变量
        System.out.println("b");//带引号输出原型
        a = a + 10;//a的自增

    }
}
