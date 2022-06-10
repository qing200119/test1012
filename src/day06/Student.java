package day06;
/*
* 方法中默认有个对象
* this 指代当前对象
* this 的用法
  *this。成员变量名------访问成员变量
  * this.方法名--------访问方法
  * 方法外面的变量叫做成员变量
  * 方法里面的叫做局部变量
  * java规定成员和局部可以同名
  * this。变量名表示成员变量
  * 堆中存的是new的对象
  * 栈中存的是局部变量
  *
  *
* */
public class Student {
    String name;
    int age;
    String address;
    void study(){
        System.out.println(this.name +"在学习");
    }
    void  sayHi(){
        System.out.println("大家好，我是"+ this.name );
    }
    Student(String name, int age, String address)
    {
      this.name = name;
      this.age = age;
      this.address = address;
    }

}
