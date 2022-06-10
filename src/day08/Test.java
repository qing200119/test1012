package day08;
/*pachage
包名避免命名冲突，同包类名不能相同
类的全称 ：包名。类名
包常常有层次结构
包名通常小写
*API：常用的类，常用的包
*域名反写。项目名称。模块名称。类名 com.taobao...
*import
   *同包中的类可以直接访问，不同包的类不能同时访问
   *想访问 类的全称-----------繁琐
   *2 先import声明，然后再访问就可以直接用 .*代表所有
*  import 代表声明。。。。中的类
*
成员变量私有化（private）本类
行为（方法）公开化（public)  都可以
protected 受保护的，本类的 同包的
类的访问权限只能是public或默认的
* */
public class Test {
    public static void main(String[] args) {
        Person s =new Doctor("zhangs",12,"sss","sdd");
        s.SayHi();
    }
}
