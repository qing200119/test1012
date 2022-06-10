package api;
/*正则表达式：正确的字符串格式规则
* 判断用户输入是否符合格式要求
上角表示排除
* [\u4e00-\u9fa5]中文范围
* .匹配任意字符
*百度正则表达式大全
*包装类valueof（）获取缓存对象
* double.parseDouble()字符串解析成double 其他对应都有 char 没有
*Infinity特殊值
* Double .isInfinite(double)是否有限
*
*每两个斜杠转义为一个
*StringBuilder
* 自动拆箱，要当心null值
* BigDecimal 精确的浮点数计算
* BIgInterger 超大的数据的运算
*
*
* */

import javax.xml.ws.Action;
import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;
public class RegexDemo {
    /*随机产生五个不重复的大写字母*/
    public  String aaa() {
         StringBuilder sb=new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        for(int i=0;i<5;i++)
        {
            int j = new Random().nextInt(26);//随机一个数
              char t = sb.charAt(i);
              sb.setCharAt(i,sb.charAt(j));
              sb.setCharAt(j,t);
        }

        String s = sb.substring(0,5);
        System.out.println(s);
        return s;

    }

    public static void main(String[] args) {
       //精确运算
        BigDecimal a = BigDecimal.valueOf(2);
        BigDecimal b = BigDecimal.valueOf(1.9);
        BigDecimal c= a.add(b);
        BigDecimal d= a.subtract(b);
        BigDecimal f= a.multiply(b);
        BigDecimal g= a.divide(b,10,BigDecimal.ROUND_HALF_UP);//不支持无理数 scale 精确，have-up四舍五入
       //setScale(保留位数，舍入方式) 舍如结果创建一个新对象
        g =f.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(c.doubleValue());
        System.out.println(d.doubleValue());
        System.out.println(f.doubleValue());
        System.out.println(g.doubleValue());











        /*RegexDemo ss =new RegexDemo();
        ss.aaa();*/
        /*Integer a= new Integer(5);
        Integer b = Integer.valueOf(5);//访问缓存对象
        Integer c = Integer.valueOf(5);//访问缓存对象
        System.out.println(a==b);//地址不同
        System.out.println(c==b);//地址相同
        System.out.println(a.equals(b));//比较封装的值
        System.out.println(a.byteValue());
        System.out.println(a.shortValue());
        System.out.println(a.intValue());

        System.out.println(a.doubleValue());*/
        /*
        * 字符串解析成int
        * interger.parseInt("255") 255
        * Interger.toBinaryString(255) 进制转换
        * */
        /*System.out.println(Integer.parseInt("1223"));

        System.out.println(Integer.toBinaryString(255));//二进制
        System.out.println(Integer.toOctalString(255));
        System.out.println(Integer.toHexString(255));*/
        /*System.out.println("电话号码");
        String s = new Scanner(System.in).next();
        String regex = "(\\d{3,4}-|\\(\\d{3,4}\\))?\\d{7,8}";//电话号码正则表达式,斜杠转义
        if(s.matches(regex)){
            System.out.println("格式真确");
        }
        else{
            System.out.println("格式错误");

        }*/
        /*System.out.println("身份证");
        String s = new Scanner(System.in).next();
        String regex = "\\d{15}|\\d{17}[\\dxX]";//身份证正则表达式
        if(s.matches(regex)){
            System.out.println("格式真确");
        }
        else{
            System.out.println("格式错误");

        }
*/

    }
}
