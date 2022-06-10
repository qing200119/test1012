package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * collection sort方法重载
 */
public class sortDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("香茗");
        list.add("adsf香茗");
        list.add("香sdf茗");
        list.add("香茗fsfsfsd");
        Mycomparator c = new Mycomparator();
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });//c代表排序方法
        System.out.println(list);
    }
}
class Mycomparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

