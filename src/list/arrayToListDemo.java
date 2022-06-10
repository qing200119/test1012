package list;

import java.util.Arrays;
import java.util.List;

/**数组转集合
 * 集合是通过数组转过来的，对集合的操作就是对数组的操作
 * 由于数组是定长的可以修改，但是不可以增删，涉及到扩容缩容*/
public class arrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","tow","three","four"};
        List<String> list = Arrays.asList(array);
        System.out.println(list);
       list.set(1,"2");
        System.out.println(list);
        System.out.println("arrays:"+Arrays.toString(array));
    }
}
