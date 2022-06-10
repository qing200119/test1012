package collection;

import java.util.ArrayList;
import java.util.Collection;
/**set集合不能重复，list可以重复*/
public class collectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        /**c.add()向当前对象加*/
        c.add("sdf");
        c.add(123);
        System.out.println(c);
        /**返回当前集合元素的个数*/
        int size =c.size();
        System.out.println(size);
       boolean isEmpty= c.isEmpty();
        System.out.println("isEmpty" +isEmpty);
        c.clear();
        System.out.println("集合已清空");
        System.out.println("isEmpty:"+isEmpty);
    }
}
