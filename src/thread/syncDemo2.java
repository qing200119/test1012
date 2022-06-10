package thread;
/**
 * 同步块
 *synchronized (this) {//拿到时间的 锁的 shop。buy方法
 *                 System.out.println(t.getName()+":试衣服");
 *                 Thread.sleep(5000);
 *             }
 * */
public class syncDemo2  {
    public static void main(String[] args) {
     shop shop =new shop();
     Thread t = new Thread(){
         @Override
         public void run() {
            shop.buy();
         }
     };
        Thread t1 = new Thread(){
            @Override
            public void run() {
                shop.buy();
            }
        };
   t.start();
   t1.start();
    }
}

class  shop{

    public void buy()
    {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":挑衣服");
            Thread.sleep(5000);
            synchronized (this) {//拿到时间的 锁的 shop。buy方法
                System.out.println(t.getName()+":试衣服");
                Thread.sleep(5000);
            }
            System.out.println(t.getName()+":结账");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
