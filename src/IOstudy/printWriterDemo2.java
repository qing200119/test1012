package IOstudy;

import java.io.*;

/**在流中使用pw
 *
 *
 * */
public class printWriterDemo2 {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos =new
                FileOutputStream("pw.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw =new BufferedWriter(osw);
        PrintWriter pw =new PrintWriter(bw);
        pw.println("一只小小鸟");
        System.out.println("over");
        pw.close();
    }
}
