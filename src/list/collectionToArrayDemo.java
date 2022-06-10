package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**集合数组的转换
 * 数组转集合只能转成ArrayList
 * 数组集合可以放重复元素
 * set集合不能放重复元素
 * */
public class collectionToArrayDemo {

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String >();
        c.add("one");
        c.add("tow");
        c.add("three");
        c.add("four");
        System.out.println(c);
        String[] array = c.toArray( new String[c.size()]);//stirng 传得是对象
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));//输出数字格式



    }
}

