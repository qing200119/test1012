package thread;
/**
 * 静态方法用 synchronized  静态方法一定要同步效果
 *
 * */
public class syncDemo3 {
    public static void main(String[] args) {

        Thread t1 = new Thread(){
            @Override
            public void run() {
                Aoo.demo();

            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                Aoo.demo();

            }
        };
        t1.start();
        t2.start();



    }


}
class Aoo{

    public synchronized static void demo()
    {
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"正在运行");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("运行结束");
    }


}

