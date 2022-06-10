package api;
import java.util.Scanner;

/*javaAPI是标准类库提供的函数 java.lang
* String  封装是char[]
*常量池节省内存，提高效率
* 字符串不可变
* String s3=s1+s2+s3 字符串加好连接每次(新建一个对象)，连接多次，效率低
*charAt(i)
**获得指定位置的char字符
* indexoof（子串）
* *查到子串的起始位置
* indexof(子串，起始位置)
* *从指定位置向后找
* lastIndexof(strat) 从后向前找
* substring (strat)截取充实strat位置到末尾的子串
* substring(start ,end)截取【start，end）
* trim（）去除两端空白字符
*append()直接向内部数组放新字符，数组放满，会创建容量翻倍的新数组
*
*
*
*
*
*  */




public class StringDemo {
    public String getName(String e) {
        e = e.trim();//去除空格
        int index = e.indexOf("@");//找到@的位置
        if (index == -1)
            return "格式错误";
        return e.substring(0, index);



        /*
         * 找@符号的位置
         * 如果index= -1 返回格式错误
         * 截取【0，index）并返回
         *
         * */

    }

    /*判断回文*/
    public static boolean huiWen(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j))//charAt(i)获得指定位置字符
            {
                return false;
            }


        }return true;
    }

    public static void main (String[]args){





        /*输出前面的名字*/
        /* System.out.println("输入email：");
        String e = new Scanner(System.in).next();
        String n = getName(e);
        System.out.println(n);
*/
            /*判断回文*/
           /* System.out.println("输入回文：");
            String s = new Scanner(System.in).next();
            if (huiWen(s)) {
                System.out.println("是回文");
            } else {
                System.out.println("不是回文");

            }*/

        /*//字符串对象创建
        char[]a = {'a','b','c'};
        String s1 = new String(a);//堆内新分配内存
        String s2 = "abc";//常量池新分配内存
        String s3 = "abc";//访问常量池存在对象
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));
        //String s4 = new String("abc") 创建两个对象，字面值在常量池建一个对象
        //然后new了一个对象
        String s5 ="abcdefghijklmnopqrstuvwxyz";
        String s="";//空串和null值不一样

        *//*
             * 获得系统时间毫秒值，从1970 1月1开始的毫秒值
             *
             * *//*
       long t = System.currentTimeMillis();//当前时间毫秒值
        for(int i=0;i<1000;i++)
        {
            s +=s5;
        }
         t = System.currentTimeMillis()-t;
        System.out.println(t);*/
        }

    }
