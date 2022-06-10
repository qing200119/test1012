package collection;

import java.util.ArrayList;
import java.util.Collection;

/**新循环遍历集合
 * 集合是对象获取的，最后还要造型一下
 * E泛型 可以指定类型 数字和字母的组合，数字不能在前面
 *泛型是jdk5退出的特性，也称为参数化类型，它允许将一个类中的属性
 * 方法参数的类型，以及返回值的类型的定义交给使用者，这使得在实际运用中更加灵活
 * */
public class newForDemo2 {

    public static void main(String[] args) {
        Collection c =new ArrayList();
        c.add("one");
        c.add("tow");
        c.add("three");
        System.out.println(c);
        /**新循环遍历会被改成迭代器遍历，
         * 所以遍历过程中不能通过集合方法删除元素*/
 for(Object o:c){
     String str =(String)o;
     System.out.println(str);
 }


    }}
