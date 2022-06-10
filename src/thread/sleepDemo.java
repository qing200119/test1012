package thread;
/**线程提供了一个静态方法
 * static void sleep（long ms）
 * Thread.sleep(5000);
 * 使用这个方法的线程阻塞特定的毫秒，超时后自动回到RUNNABLE状态，等待再次并发执行
 * */
public class sleepDemo {
    public static void main(String[] args) {
        System.out.println("start:");

        while (true) {

            System.out.println("你好:");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
