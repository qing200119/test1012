package thread;
/***
 * void join()协调线程之间的同步运行
 * 同步与异步
 * 同步：运行有顺序
 * 异步：运行代码无顺序，多线程并发运行，是异步运行
 *
 * */
public class joinDemo {

private  static  boolean IsFINASH = false;
    public static void main(String[] args) {

        Thread download = new Thread(){
            @Override
            public void run() {
                System.out.println("开始下载");
                for(int i=0;i<100;i++){

                    System.out.println(i+"%");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {


                    }
                }
                System.out.println("图片下载完毕");
                IsFINASH = true;

            }
        };
        Thread show = new Thread(){
            @Override
            public void run() {
                System.out.println("显示图片");
                try {
                    download.join();//什么时候download结束后，才写其他的
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(!IsFINASH){
                    throw new RuntimeException("加载图片失败");
                }
                System.out.println("加载图片完成");
            }
        };

       download.start();
       show.start();

    }
}
