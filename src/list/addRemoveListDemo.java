package list;

import java.util.ArrayList;
import java.util.List;

/**list 提供重载的 add remove*/
public class addRemoveListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");//ctrl +D 把上一行复制到下一行
        list.add("five");
        System.out.println(list);
        /**void add(int index E e)
         * 添加指定位置元素
         * */
        list.add(1,"2");
        System.out.println(list);
        String old =list.remove(2);
        System.out.println(list);
        System.out.println(old);

    }
}
