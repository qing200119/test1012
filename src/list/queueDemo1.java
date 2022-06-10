package list;

import java.util.Deque;
import java.util.LinkedList;

/*双端队列*/
public class queueDemo1 {
    public static void main(String[] args) {
        Deque<String> deque =new LinkedList<String>();
        deque.offer("one");
        deque.offer("tow");
        deque.offer("three");
        deque.offerLast("four");
        //deque.offerFirst("111");
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.peekLast());
        System.out.println(deque);
        System.out.println(deque.peekLast());

    }
}
