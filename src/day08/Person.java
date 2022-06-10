package day08;

public class Person {
    String name;
    int age;
    String address;
    Person(String name,int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void SayHi(){
        System.out.println("我是"+name+"今年"+age+"家住"+address);
    }
}
//final 不能被继承，但可以继承别人 不能被重写，被更改

final class Foo{
    final  void show(){}
    void test(){};
}

/*
* 成员变量分两种：
* 1）实例变量 没有static 修饰 ，属于对象，存储在堆中 有多个
* 2）静态变量有 static 修饰 属于类 在方法中  有一个 存储在方法中
*内存管理：JVM管理
* 堆 对象（包括实例变量）
* 栈 局部变量 参数列表
* 方法区 。class字节码文件（静态变量 方法）
*  局部用对象调用 静态用类名。静态变量调佣
* 所用对象共享的数据，用static 图片 音乐 视频
* 普通方法有this传递
* static静态方法没有this传递
*
*静态块{}
* 由static修饰，属于类，静态块没有名字，只是被执行，类被加载时自动执行
* 一个类只被加载一次，所以只执行一次
*和使用：初始化图片，音频，视频
* */