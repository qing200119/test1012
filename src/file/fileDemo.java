package file;

import java.io.File;

/***
 * File d的每个实例用于表示硬盘上的文件或目录
 * 1）访问其表示的文件或目录的属性（名字，大小，访问权限）
 * 2）操作文件或目录（创建，删除）
 * 3）访问目录子项  ，不能看看文件数据
 *
 *
 *
 * */
public class fileDemo {
    public static void main(String[] args) {
   /*访问当前文件test，不要绝对路径 ,
   .叫当前目录
   路径好在可以跨平台
   */
        File file = new File("./test.txt");
       String name= file.getName();
        System.out.println("name:"+name);
        long length = file.length();//文件的大小字节数
        System.out.println(length);
        boolean cw = file.canRead();//查看权限
        boolean cr = file.canRead();
        boolean ih = file.isHidden();
        System.out.println("可读"+cw);
        System.out.println("可写"+cr);
        System.out.println("可隐藏"+ih);


    }
}
