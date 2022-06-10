package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**foreach 可以使用lambda遍历，
 * 自行维护并发安全
 *
 *
 * */
public class LambdaDemo2 {

    public static void main(String[] args) {
        List<String> list =new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
for(String str:list){
    System.out.println(str);
}


//JDK8  foreach
        list.forEach((str)-> System.out.println(str));
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("语文",99);
        map.put("数学",99);
        map.put("英语",99);
        map.put("化学",99);
        map.forEach((k,v)-> System.out.println(k+""+v));





    }}
//javaScript 简称js
//用于给页面添加动态效果