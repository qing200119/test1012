package day09;
public class NstnnerClassDemo {
/*匿名内部类，简化代码操作
* 创建了一个Aoo的派生类，但没有名字
* 为该类创建一个对象，o1,
* 大括号里面为派生类的类体
*成员内部类 效率低
* 1）类中套类 外部的称为外部类，内部的称为内部类
* 2）内部类通常只服务与外部类，对外不具有可见性
* 3）内部类对象只能在外部类中创建
* 内部类可以直接访问外部类的成员（包含私有的
* 4）内部类有个隐式的引用，指向了创建他的外部类对象
* 5）语法外部类名.this.
*匿名内部类不能修改外部类的变量的值，此处默认为final
*****内部类有独立的。class
面试题*成员内部类
*  *外部类名$内部类名。class
**匿名内部类
*   *外部类名$ 1,2,3(内部类名).class
*
*
*
* */
 Aoo o1 = new Aoo() {

 };


}

abstract class Aoo{

}
class Boo extends Aoo{

}