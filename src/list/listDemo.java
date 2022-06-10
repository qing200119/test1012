package list;

import java.util.ArrayList;
import java.util.List;

/**java.util.ArrayList内部由数组实现，查询性能更好
 *
 *
 * java.util.LinkList 内部由链表实现，增删元素性能更好，
 * 尤其是首位增删，没有特别要求，使用Array
 *
 * List，Set是继承于Collection
 *
 *
 * Map没有继承于Collection其相对是独立的属于Collection类型的对象可以通过构造函数将一个集合构成另一
 * 个集合。
 * */
public class listDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("tow");
        list.add("three");
        list.add("four");
        System.out.println(list);
        String str = list.get(1);//括号里面是下标
        System.out.println(str);
        for(int i=0;i<list.size();i++){
            str =list.get(i);
            System.out.println(str);
        }
       /** E.set (int index,E e),做替换元素*/
       String old = list.set(1,"2");
        System.out.println(list);
        System.out.println(old);
    }
}
