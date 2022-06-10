package collection;

import java.util.ArrayList;
import java.util.Collection;

public class removeDemo {

    public static void main(String[] args) {
        Collection c= new ArrayList();
        c.add(new point(1,2));
        c.add(new point(2,2));
        c.add(new point(3,2));
        c.add(new point(4,2));
        System.out.println(c);
        point p = new point(1,2);
        c.remove(p);//要重写 equals
        System.out.println(c);


    }
}
