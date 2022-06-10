package IOstudy;
import java.io.*;

public class bufferReaderDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new
                FileInputStream("src/IOstudy/bufferReaderDemo.java");
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        BufferedReader br = new BufferedReader(isr);
       // br.readLine();
        /*read.line()读取一行字符串
        返回换行符前面的字符串
        *返回null，读到末尾
        * */
         String line = null;
         while ((line = br.readLine())!=null){
             System.out.println(line);
         }
     br.close();
    }

}
