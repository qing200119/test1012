package thread;
/**第二种创建线程的方式
 *
 * 实现Runnable接口，单独定义线程任务
 **
 * */
public class threadDemo2 {
    public static void main(String[] args) {
        //实例化两个任务
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable1();
        //创建两个线程任务

        Thread t1 =  new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }
}

class  MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){

            System.out.println("who are you");
        }
    }
}

class  MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){

            System.out.println("who are you");
        }
    }
}