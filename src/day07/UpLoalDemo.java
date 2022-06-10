package day07;

public class UpLoalDemo {
    public static void main(String[] args) {
        Aoo a1 = new Aoo();
        a1.a=1;
        Boo b1 = new Boo();
        Aoo c1 = new Boo();//向上造型

/*向上造型好处
*只能访问超类里面有的
*重写： 父子类 方法名相同 （override）参数列表相同 方法体不同
*       重写方法被调用时看对象类型
*        重写两同两小一大-------方法名 参数列表
*        两小一大
*           派生类抛出异常小于等于超类方法，返回值小于等于超类方法
*           void 时 必须相等
*           基本类型 必须相同，
*           引用类型时 小于或等于
*super.show()调用超类的方法；
* 重写与重载的区别（override 与 overloading的区别）
*    重写发生在父子类中，方法名称相同，参数列表相同
*    重载发生在同一类中  方法名称相同，参数列表不同
*
*
* */

    }
}
class Aoo{
    int a;
    void show()
    {}
}
class Boo extends Aoo{
    int b ;
    void  test(){}
}