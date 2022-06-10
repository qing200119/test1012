package api;
import java.text.ParseException;
import java.util.Date;//util 工具
import java.text.SimpleDateFormat;//日期格式工具，时间格式字符串，解析成date对象
import java.util.Scanner;
//yyyy-MM-dd HH:mm:ss
//dd/MM/yyyy
//yy-M-d
/*text。。。。。
*
*
*
*
*
* */
/**
 * 日期
 * 封装毫秒值
 *  创建对象
 *  * new Date（）封装系统当前毫秒值
 *  *new Date（90000000000L）封装指定毫秒值
 *  * getTime()
 *  *setTime(long t)
 *  comepareTo(Date d)比较时间
 *
 * **/
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        System.out.println("输入生日(yyyy-MM-dd)");
        String  s = new Scanner(System.in).nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date d= sdf.parse(s);
        long t = System.currentTimeMillis() - d.getTime();
        t =t/1000/60/60/24;
        System.out.println("我已经生存了"+t+"天");

         /*Date a = new Date();
        Date b =new Date(9000000000000L);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.getTime());
        System.out.println(b.getTime());
        a.setTime(0L);
        System.out.println(a);
        System.out.println(a.compareTo(b));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s1 =sdf.format(a);
        String s2 =sdf.format(b);
        System.out.println(s1);
        System.out.println(s2);*/




    }
}
