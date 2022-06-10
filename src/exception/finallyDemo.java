package exception;

/*
* try catch 异常快捷键 Ctrl+alt +T  结构选择
*
*
* */
import jdk.internal.org.objectweb.asm.commons.TryCatchBlockSorter;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
* final finally finalize
* final : 关键字
* finally: 异常的最后一块，一定要执行
* finalize: 一个类的要被gc回收之前，最后的操作，不能做耗时操作
*
*
* */
public class finallyDemo {

/*  finaly里的return会覆盖catch里的return */
    public static int test(String str){
        try {
            return str.charAt(0)-'0';
        }catch (NullPointerException e){
            return 1;

        }
        catch (Exception e) {
            return 2;
        } finally {
        return 3;
        }

    }



    public static void main(String[] args) {
           //结果3,3,3（错误0，1,2）
        System.out.println(test("0")+test(null)+test(""));


        /* 新的需要关闭的放到try后小括号里*/
//        try (
//               /*实现了AutoCloseable接口，编译器最终将会改变代码，在finally中将其关闭*/
//                FileOutputStream fos = new FileOutputStream("fos.txt");
//        )
//        {
//            fos.write(1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }






        /*FileOutputStream fos =null ;

        try {
            fos = new FileOutputStream("fos.txt");
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fos!=null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
*/
    }
}
