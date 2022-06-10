package thread;
/**线程优先级
 *线程不能主动获取CPU，只能被动调整
 * 线程优先级可以最大程度上改善某个线程获取CPU的次数，
 * 理论上线程优先级高的获取CPU时间片的次数多
 *
 *
 * */
public class priorityDemo {
    public static void main(String[] args) {

        Thread max = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("max");
                }
            }

        };
        Thread max1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("max1");
                }
            }

        };
        Thread max2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("max2");
                }
            }

        };
        max.setPriority(Thread.MAX_PRIORITY);//设置优先级
        max2.setPriority(Thread.MIN_PRIORITY);
     max.start();
     max1.start();
     max2.start();













    }
}