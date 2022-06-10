package day06;
/*构造方法可以重载
 *与类同名，没有返回值，会被自动调用
 * 若自己没有写构造方法，编译器会默认一个无参构造方法
 * 自己写了，则不在开始默认
* */
public class StudentTest {
    public static void main(String[] args) {

        Student[] stus = new Student[3];
        stus[0] = new Student("zhangsan",23,"lf2");
        stus[1] = new Student("zas",23,"lf1");
        stus[2] = new Student("zangs",23,"lf");
        for(int i=0;i<stus.length;i++)
        {
            System.out.println(stus[i].name+" 你好");
        }


    }
}
