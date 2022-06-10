package thread;
/**
 * 线程提供了获取相关信息的方法*/
public class ThreadDemo3 {

    public static void main(String[] args) {
        /**
         * 获取main方法的线程 Thread.currentThread()
         * main方法也是靠一个线程运行的，当jvm 启动后自动创建一个线程，
         * 也叫做主线
         *
         * */

        Thread main = Thread.currentThread();//获取当前线程
        /*
        *获取线程名字
        * */
        String name = main.getName();

        System.out.println("name"+name);
        /*
        *
        * 获取唯一标识符（ID）
        * */
        long id = main.getId();
        System.out.println("id"+id);
        /*
        * 线程优先级
        * */
        int priority = main.getPriority();
        System.out.println("priority"+priority);

        /*
         * 线程活着
         * */
        boolean isAlive = main.isAlive();
        System.out.println("isAlive"+isAlive);
        /*线程是否中断
         * */
         boolean isInterrupted  = main.isInterrupted();
        System.out.println("isInterrupted "+isInterrupted);
        /*是否为守护线程*/
        boolean isDeamon = main.isDaemon();
        System.out.println("isDeamon:"+isDeamon);




        /*
        System.out.println("main:"+main);
        des();
        Thread t = new Thread(){//匿名内部类
           public void run(){
               Thread t = Thread.currentThread();
                System.out.println("jdi:"+t);
            }
        };
        t.start();*/

    }

    public static void des(){
        Thread t = Thread.currentThread();
        System.out.println("des:"+t);

    }

}
