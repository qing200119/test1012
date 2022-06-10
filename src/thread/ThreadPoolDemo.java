package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //两个线程，并发效果
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        for(int i=0;i<5;i++){
            //任务
           Runnable runn = new Runnable() {
               @Override
               public void run() {
                   Thread t =Thread.currentThread();
                   try {
                       System.out.println("zaiyunxing "+t);
                       Thread.sleep(5000);
                       System.out.println(t+"运行结束");
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
               }
           } ;
           //将任务指派给线程池
           threadPool.execute(runn);
            System.out.println("指派任务给线程池");

        }

        //结束循环，showdon 不在调用线程，把手里个工作结束后才结束
        threadPool.shutdown();
        System.out.println("线程结束");
        //threadPool.shutdownNow() 强制中断，马上停止
    }
}
