package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**Map表，键值对HashMap(散列表)
 * 散列表是当今世界查询速度最快的数据结构
 *map 返回value
 * map的key不允许重复
 *如果map值已有key,那么map操作为替换value
 * 返回值为原先的value */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer>map= new HashMap<String, Integer>();
        map.put("语文",17);
        map.put("数学",19);
        map.put("英语",49);
        map.put("化学",51);
        map.put("化学",66);
        Integer d = map.put("语文",95).intValue();
        System.out.println(d);
        System.out.println(map);
        System.out.println(map.get("数学"));
        System.out.println(map.size());
        //System.out.println(map.remove("语文"));
        //System.out.println(map);
        /**map的遍历
         * Set<k> KeySet()
         *
         * */
        //遍历所有key
       Set<String> keySet =map.keySet();
       for(String key:keySet){
           System.out.println("key:"+key);
       }
     //遍历键值对entrySet()
     Set<Map.Entry<String,Integer>> entrySet  =map.entrySet();
        for(Map.Entry<String ,Integer> e:entrySet){
            String key =e.getKey();
            Integer value =e.getValue();
            System.out.println(key+":"+value);
        }



    /*便利所有value*/
        Collection<Integer> values =map.values();
        for(Integer value:values){
            System.out.println(value);
        }


    }




}
