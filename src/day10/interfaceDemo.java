package day10;
/*接口（默认的，写不写public abstract）
* 1）接口是一种数据类型（引用类型） 和类同级
* 2）由interface
* 3)接口中只能包含常量和抽象方法（常量要初始化）
* 4）接口不能被实例化
* 5）接口需要被实现、继承，派生
*    必须重写所有接口中的抽象方法，用逗号分开
* 6)接口可以先继承，后实现，接口可以继承接口
*抽象方法不能有方法体
* 派生类关键字大于等于超类
*部分派生类共有的属性和行为，抽到接口中
* 接口的目的是实现多继承
*
*
* */

public class interfaceDemo {
    public static void main(String[] args) {

    }

}
interface  inter1{
    void show();

}
interface  inter2{
    void show1();
}
class Aoo implements inter1,inter2{
    public void show(){}
    @Override
    public void show1() {

    }
}