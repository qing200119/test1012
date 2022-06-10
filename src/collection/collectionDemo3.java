package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**addall()取并集，set是个不可重复的集合
 * 在集合里不能通过下标操作，可以通过遍历模式
 * 迭代器
 *
 * */
public class collectionDemo3 {
    public static void main(String[] args) {
        Collection c =new ArrayList();
        c.add("dsf");
        c.add("sdjfoigr");
        c.add("java");
        Collection c2 = new HashSet();
        c2.add("java");
        System.out.println("c:"+c);
        c2.addAll(c);
        System.out.println(c2);
        Collection c3 =new ArrayList();
        c3.add("c");
        c3.add(".net");
        System.out.println("c3:"+c3);
        /**boolean ca =c2.containsAll(c3);\
         * 判断当前集合是否包含给定集合全部元素
         *
         * */
        boolean ca =c2.containsAll(c3);
        System.out.println("全包含" +
                ca);
      /**c2.removeAll(c3)删除交集元素;*/
        c2.removeAll(c3);
        System.out.println(c3);


    }
}
