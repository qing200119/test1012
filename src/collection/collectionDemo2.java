package collection;
import sun.text.resources.CollationData;
import java.util.ArrayList;
import java.util.Collection;
/**集合只能存元素引用类型，存不了别的*/
public class collectionDemo2 {
    public static void main(String[] args) {
        Collection c= new ArrayList();
        c.add(1);
        System.out.println(c);
        point p =new point(1,2);
        c.add(p);
        System.out.println(c);
        System.out.println(p);
        p.setX(2);
        System.out.println(c);
        System.out.println(p);
    }
}
