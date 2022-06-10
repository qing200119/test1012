package thread;
/**
 * 互斥锁
 * 多个方法模块用 synchronized 实现互斥
 *
 * */
public class syncDemo4 {
    public static void main(String[] args) {
    Boo boo =new Boo();
    Thread t = new Thread(){
        @Override
        public void run() {
            boo.methodA();
        }
    };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                boo.methodA();
            }
        };
   t.start();
   t2.start();
    }
}
class  Boo{
    public  synchronized void methodA(){
        try {
            System.out.println("正在运行");
            Thread.sleep(500);
            System.out.println("运行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  synchronized void methodB(){
        try {
            System.out.println("正在运行");
            Thread.sleep(500);
            System.out.println("运行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}