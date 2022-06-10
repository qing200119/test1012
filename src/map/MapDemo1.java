package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<String, Integer>();
        map.put("语文",17);
        map.put("数学",19);
        map.put("英语",49);
        map.put("化学",51);
        map.put("化学",66);
        System.out.println(map);
        boolean b= map.containsKey("语文");
        boolean b1=map.containsValue("包含key"+b);
    }
}
