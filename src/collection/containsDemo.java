package collection;

import java.util.ArrayList;
import java.util.Collection;

/**集合包含了判断是否包含给定元素的方法*/
public class containsDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new point(1,2));
        c.add(new point(2,2));
        c.add(new point(3,2));
        c.add(new point(4,2));
        c.add(new point(5,2));
        /**集合的toString方法会将每个元素的toString体现出来*/
        System.out.println(c);
        /**contains依靠元素自身equals比较的结果
         * 判断集合是否包含该元素*/
        point p =new point(1,2);
        System.out.println(c.contains(p));


    }
}
