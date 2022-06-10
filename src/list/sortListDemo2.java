package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/***/
public class sortListDemo2 {

    public static void main(String[] args) {
        List<point> list  = new ArrayList<point>();
        list.add(new point(3,4));
        list.add(new point(4,4));
        list.add(new point(1,4));
        list.add(new point(6,4));
        list.add(new point(7,4));
        System.out.println(list);
        /**sort 方法元素必须可比较
         *元素必须实现comparable接口
         * *
         * */
        Collections.sort(list);
        System.out.println(list);
    }
}
