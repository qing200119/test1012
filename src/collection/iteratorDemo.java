package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**集合提供遍历元素的一种方式，迭代器模式
 * Iterator iterator()该方法可以获取一个用来遍历当前迭代器的实现类，通过它遍历元素
 * 迭代器通过问 ，取，删
 * 删除元素不是必要操作
 *集合不能在遍历的时候删除元素，只能迭代器删 it.remove();
 * */
public class iteratorDemo {
    public static void main(String[] args) {
        Collection c= new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        /*迭代器适合while遍历*/
        Iterator it = c.iterator();
        while (it.hasNext()){
            /**问的过程 boolean hasNext 判断
             * 是否还有元素迭代
             *e.next取得下一个元素
             *
             * */
            String o = (String)it.next();//取得过程
            System.out.println(o);
            if("#".equals(o)){
                it.remove();
            }
            System.out.println(o);
        }
        System.out.println(c);
    }
}
