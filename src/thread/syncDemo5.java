package thread;

import com.sun.xml.internal.ws.server.sei.SEIInvokerTube;

import java.util.*;

/**list 中场实现类Arrarylsit LinkLIst
 * 并不是线程安全的*/
public class syncDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("one");
        list.add("three");
        list.add("four");
        System.out.println(list);
        /**将给定集合转换为线程安全的，set集合也一定
         * 线程安全的集合，在遍历时是不能和迭代器做互斥，
         * 必须要自身维护操作
         * */
        list = Collections.synchronizedList(list);
        System.out.println(list);
        Set<String> set = new HashSet<String >();
        set = Collections.synchronizedSet(set);
        System.out.println(set);


    }
}
