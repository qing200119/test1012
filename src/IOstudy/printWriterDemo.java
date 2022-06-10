package IOstudy;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**缓冲字符流
 *printWriter自动换行
 *
 * */
public class printWriterDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pW=  new PrintWriter("pw.txt","utf-8");
        pW.println("像一颗海藻海草好菜");
        pW.println("随风起照耀");
        System.out.println("写完吧");
        pW.close();

    }


}
