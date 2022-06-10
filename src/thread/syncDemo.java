package thread;

/**
 * 多线程并发安全问题
 * 将并发资源改为同步资源
 */
public class syncDemo {
    public static void main(String[] args) {
        Table ta = new Table();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    int bean = ta.getBeans();
                    System.out.println(getName() + ":" + bean + "取出");
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    int bean = ta.getBeans();
                    System.out.println(getName() + ":" + bean + "取出");
                }
            }
        };
        t1.start();
        t2.start();

    }
}

class Table {
    private int beans = 20;

    /**
     * 当一个方法被synchronized 修饰后，该方法被称为同步方法，
     * 即多线程不能同时在方法内部运行
     * 强制让多个线程执行一个方法时变为同步操作
     * synchronized 同步锁。
     */

    public synchronized int getBeans() {
        if (beans == 0) {
            throw new RuntimeException("没有豆子了");//不检查异常
        }
        Thread.yield();//模拟执行到这里没有时间了
        return beans--;

    }

}

