package thread;
/**守护线程
 * 守护线程又称为后台线程，默认创建的线程都是普通的线程
 * 线程提供里一个方法，只有调用该方法并传入参数TRUE时，该线程才是守护线程
 * 线程结束：当一个进程所有普通线程都结束时，守护线程必须结束，进程结束
 *  main方法结束了，程序也没有断，进程结束，程序结束
 *  进程结束：所有线程结束
 *
 * */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread ros = new Thread(){
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    System.out.println("我要走了");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("好的");
                System.out.println("没了");
            }
        };
        Thread job = new Thread(){
            @Override
            public void run() {
                while (true) {
                    System.out.println("you jump,i jump");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        };
        /*设置守护线程要在线程启动之前*/
        job.setDaemon(true);
        ros.start();
        job.start();
        System.out.println("main线程结束了");

    }

}
