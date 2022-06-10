package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**java 的反射机制
 * 反射机制可以允许我们实例化一个类
 * 操作属性从编码期改为在运行期决定
 * 以在运行期间的动态得知一个类的情况（方法，属性）
 * 反射机制大大提高代码灵活度
 * 开发中使用要适度，过度使用反射会降低效率*/


public class ReflectDemo {
/**反射第一步：获取要操作的类的类对象
 * java的JVM中加载的类在JVM中只有一个类对象
 * 通过类对象可以知道类的信息
 * 获取类对象方法
 * 1forName()指定想加载的类
 * 2类名。class
 * 3通过类加载器ClassLoader
 *完全限定名：包名.类名
 *
 *
 * ***通过类对象快速创建实例 利用反射
 * */
public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {

    Person p = new Person();
    p.sayHello();

    //利用反射
     Class  cls= Class.forName("reflect.Person");
     Object obj = cls.newInstance();
     Method method=  cls.getMethod("sayHello");
     method.invoke(obj,null);


   /* //newInstance()默认无参构造器
    //该实例必须包含无参构造器
    Scanner scanner = new Scanner(System.in);
    Class cls = Class.forName(scanner.nextLine());
    Object obj =cls.newInstance();
    System.out.println(obj);*/


/*

    //查看person类信息
Class cls=  Class.forName("reflect.Person");//包名。类名
    System.out.println(cls.getName());
    Method[] methods = cls.getMethods();
    for(Method method: methods){
        System.out.println(method.getName());
    }
*/







}


}



class Person{
    public  void sayHello(){
        System.out.println("hello");
    }
    public  void sayHi(){
        System.out.println("hi");

    }


}

