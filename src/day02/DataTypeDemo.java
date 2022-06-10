package day02;

public class DataTypeDemo {
    public static void main(String[] args) {

        /* 类型转换
        强转会丢精度，可能会溢出
        自动转，小类型变为大类型
        两点规则；
        1）整数直接量可以直接赋值byte short char,但不能超出范围                                        bbbbbbbbbbbbbbbbb                                                                                                                                                                                                                                                         b
        2) byte short char 做运算时会自动转化为int

         */
        System.out.println('2' + '2');//0的，码50






















        /*直接量：
         int ：
         直接量，直接写出来的数
         整数直接量：直接写出来的整数
         整数直接量默认int 但一定在这个范围内
         两个整数相除还是整数，小数位无条件舍去
         要保留小数一定要有小数位

        System.out.println(5/2);
        System.out.println(2/5);
        /*
         整数运算时，超出运算范围，溢出。
         直接量超范围，为编译错误
         运算时超范围为溢出
         */
        /*
        长整型long 8个字节
        长整型一般在后面直接加L、l
        运算时有可能发生一溢出时，应该在第一个数后加L

        long f = 1000000000L;
        /*
        double 浮点数默认类型，若想用float 加f
        double和float参与运算时有可能发生舍入误差
        精确场合不能用

        double pi = 3.1244;//默认浮点直接量
        float  fi = 3.1434f;//float型的直接量
        /*
        boolean 只有TRUE 和false
         */
        /*
        char 字符型，2个字节，采用Unicode字符集编码 通用码，固定16位
        一个字符对应一个码，表现为字符，实质上还是数字码
        ‘a’ 97
        ‘0’ 48
        A   65
        字符直接量只能放到单引号里
        单引号必须有字符，只能有一个字符
        0到65535之间
        写数字和写字符一样
        特殊的符号需要反斜杠转义

        char c1 = '女';
        char c2 = 97;
        char c3 = 'a';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        char c4 = '\\';
        System.out.println(c4);*/
    }
}
