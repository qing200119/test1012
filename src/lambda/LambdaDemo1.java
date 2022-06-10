package lambda;

import java.util.Comparator;

/**函数式编程
 * 更方便快捷创建匿名内部类,接口只能有一个方法
 * 如果方法区里只有一行代码的，大括号可以去掉
 * 使用lambda创建匿名内部类要求只能有一个方法*/
public class LambdaDemo1 {

    public static void main(String[] args) {
       /* Runnable r2 =()->{

        };*/

        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        //2/方法中参数类型可以不再指定，编译器会结合程序自行分析参数类型
        Comparator<String> com2 =(o1,o2)->o1.length()-o2.length();




    }

}
