package exception;
/*thorws重写规则
* 超类可以抛子类，子类不可抛超类
* 允许不抛出异常，允许抛出部分异常
* 检查异常
* 非检查异常 runtimeExceptin 运行时异常，由JVM....
*
*自定义异常
*
* */
public class throwsDemo2 extends Exception{
private static final long serialVersionUID = 1L;

    public throwsDemo2() {
    }

    public throwsDemo2(String message) {
        super(message);
    }

    public throwsDemo2(String message, Throwable cause) {
        super(message, cause);
    }

    public throwsDemo2(Throwable cause) {
        super(cause);
    }

    public throwsDemo2(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
