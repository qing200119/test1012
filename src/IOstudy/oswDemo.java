package IOstudy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
* *字符流读写单位是字符
* 字节流读写单位是字节
* java。IO。reader， java。IO。writer
* 转换流
* *他们是一对常用的字符流实现类，经常在我们做字符数据读写操作中使用，并且在流链接中
**非常重要，但是我们很少对它直接操作
* */
public class oswDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");


        String line ="我司都和我魔法";
         osw.write(line);
         osw.write("a");//写字符
        line="afdierucdfwe";
        System.out.println("写好了");
        osw.close();





    }
}
