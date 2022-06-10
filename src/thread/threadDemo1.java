package thread;
/**
 * 线程是并发的
 * 方式一
 * 启用线程调用start（）方法而不是直接调用run方法，
 * 当start调用完成后，run会很快调用
 * 优点 简单直接
 * 缺点 由于继承线程，这导致不能再继承其他类，实际开发过程中要经常复用超类
 *     重写了run方法，导致线程和线程的执行有一个必然的耦合关系，不利于线程的重用
 *
 * */
public class threadDemo1 {

    public static void main(String[] args) {
        Thread p1 = new MyThread1();
        Thread p2 = new MyThread2();
        p1.start();
        p2.start();
    }

}

class MyThread1 extends Thread{
/*run 自动调用*/
    public void run(){
        for (int i = 0;i<15;i++){
            System.out.println(" who are you");
        }

    }


}
class MyThread2 extends Thread{

    public void run(){
        for (int i = 0;i<10;i++){
            System.out.println(" i am your father");
        }

    }

}