package day10;
/*多态
  方法的多态
  类的多态，多态离不开向上造型
  型一定会继承
  多态一定会继承
向上造型
* 超类的引用指向派生类的造型
* 能够造型的数据类型：超类+所实现的接口
* 能点出来是吗看引用的类型
*强转类型
* 成功条件 1）引用所指向的对象就是该类型
         2）引用所指向的对象 必须继承该类该接口
*
*
*

*/


public class manyStyleDemo {
    public static void main(String[] args) {
        Boo o = new C00();
        C00 o1 =(C00) o;//强转类型
    }
}
interface Inter{ }
class Boo{}
class C00 extends Boo implements Inter{}
class Doo extends Boo{}