package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*collections collection的工具类*/
public class collectionsDemo {
    public static void main(String[] args) {
        /*sort 可以对list集合进行自然排序*/
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));

        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}