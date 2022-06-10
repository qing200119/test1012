package list;
import sun.applet.Main;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**双缓冲队列*/
public class blockingQueue {
    public static void main(String[] args) {
        BlockingQueue<String > queue = new LinkedBlockingDeque<String >();
        try {
            queue.offer("one");
            queue.offer("two",500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}