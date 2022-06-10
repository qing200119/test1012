package list;

import java.util.LinkedList;
import java.util.Queue;

/**队列继承collection*/
public class queueDemo {
    public static void main(String[] args) {
        Queue<String > queue =new LinkedList<String>();
        queue.offer("one");
        queue.offer("tow");
        queue.offer("three");
        queue.offer("four");
        System.out.println(queue);
        String str = queue.poll();//出队操作,队列元素真实减少
        System.out.println(str);
        System.out.println(queue);
        /**peak调队列，元素依然在队列里
         *
         */
         str= queue.peek();
        System.out.println(str);
        System.out.println(queue);
        /*遍历
        * 新for遍历采用的是迭代器，用的是peak*/

        for(String s:queue){
            System.out.println(s);
        }
        System.out.println(queue);


    }

}
