package file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*RAF是专门读写文件数据的API，基于指针
对文件数据进行读写操作，可以灵活编辑
数据内容
创建RAF可以指定该文件的权限
*r 只读模式   发现不存在报错
*rw 读写模式  发现文件不存在会创建
*  相对路径   ./不写就是默认在当前目录
*RandomAccessFile（File file ,String mode）
**RandomAccessFile（String path ,String mode）

*/
public class rafDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");



        /*
        * 文件读出来
        * 读一个字节，并以int值返回 ，若返回值为-1
        * 则读到末尾
        * */
        /*raf.write(97);
        int d = raf.read();
        System.out.println(d);//返回值为-1 表示读到末尾
*/
        /*
        * void write(int b） 项文件中写入1字节
        * 对应2进制低八位
        * 00000000 00000000 000000000 。。。。。
        *
        * */
        /*raf.write(1);

        System.out.println("写完吧");
        raf.close();//用完必须关闭*/
    }


}
