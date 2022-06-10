package exception;
/**
 * 异常处理机制 try catch
 * finally 里面的代码一定执行
 **
 * 1)
 * 2)
 * 3)
 *
 *
 * */
public class tryCatchDemo {
    public static void main(String[] args) {

        /**当JVM发现一个异常时，会根据错误实例化异常实例
         * 并将程序设置进去，然后抛出，程序终止
         *在try中，一旦报错了之后代码都不执行
         *  */
        try {
            String str ="a";
            System.out.println(str.length());
            System.out.println(str.charAt(0));
         //   System.out.println(Integer.parseInt(str));

            System.out.println("over");
        }catch (NullPointerException e){
            System.out.println(" 空指针err");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("字符串下标越界");
        }catch (Exception e){
            /*应当在catch 处捕获exception
            尽量避免一个未补货导致程序中断
            * */
            System.out.println("err 2");

        }
        finally {
            System.out.println("一定执行");
        }
        System.out.println("app over");
    }
}
