package list;

import java.util.Deque;
import java.util.LinkedList;

/**push poll*/
public class SstackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<String>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        System.out.println(stack.pop());
    }
}
