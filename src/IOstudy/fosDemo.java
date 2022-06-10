package IOstudy;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
* 输入流，外界输入到程序
 * 输出流 程序输出
 * java将流划分为两大类 节点流 处理流
 * 节点流：低级流
 * 处理流：高级流 不独立存在，必须连接在其他文件上
 * 实际操作，通过低级流写数据，通过高级流对读写加工，完成一个复杂的读写操作
 * 被叫做流链接
 * 文件流是一种低级流
 * 流失顺序读写方式，不能做到任意读写指定，也无法对文件数据进行操作
 * 但配合高级流可以更轻松读写
 * RAF是基于指针的随机读写，可以任意读写文件指定位置
* ***
 *
 *
 *
 *
 *
 *
*
* */
public class fosDemo {
    public static void main(String[] args) throws IOException {
        /***
         * 文件的输入流向文件写字节
         *FileOutputStream(File file)当文件存在时，先删除里面的数据
         * ileOutputStream(String name, boolean append),末尾追加写，不删除
         * */
        FileOutputStream fileOutputStream =
                new FileOutputStream("fos.txt",true);

        String line = "你好，我好，大家hao";
        byte[] data = line.getBytes("utf-8");
        fileOutputStream.write(data);
        System.out.println("写好了");
        fileOutputStream.close();



    }



}



