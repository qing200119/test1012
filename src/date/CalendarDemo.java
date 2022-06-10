package date;
/*calendar当前系统时间*/
import java.util.Calendar;
import java.util.Date;

/**calendar*/
public class CalendarDemo {
    public static void main(String[] args) {
        //Calendar 是抽象类，操作时间的
        //提供了获取类实现的静态方法
        Calendar calendar = Calendar.getInstance();
        //calendar信息很全，但是不好看
        Date date =calendar.getTime();
        System.out.println(date);
        /*calendar 还提供setTIme（）相反的关系*/
         /*获取时间分量信息,参数int,不同的值代表不同的信息*/
     int year=   calendar.get(Calendar.YEAR);//1
        int month=calendar.get(Calendar.MONTH+1);//2，月是从0开始算的
        int date1 = calendar.get(Calendar.DAY_OF_MONTH);//月中天
        //时分秒
        int dow = calendar.get(Calendar.DAY_OF_WEEK);
       String[] data ={"一","二","三","四","五","六","日"};
        System.out.println("周"+data[dow-1]);
        //还有set....方法





    }

}
