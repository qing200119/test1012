package day05;

public class MethodDemo {
    public static void main(String[] args) {
    int a = getNum();
        System.out.println(a);
    }

    public static int getNum()
    {
     //方法有返回值必须返回return，return的类型必须与返回值类型匹配

        //return 后方法结束，返回给调用方
        //有返回值的必须先声明一个变量的方法，然后赋值
        return 3;
    }


}
