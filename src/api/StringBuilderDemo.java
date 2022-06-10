package api;
/**api 文档
 *append()追加：直接向内部数组放新字符，数组放满，会创建容量翻倍的新数组
 *StringBuffer线程安全
 * StringBuiler 线程不安全，效率高
 *
 **/
public class StringBuilderDemo {
    public static void main(String[] args) {

        /**append()测试**/
        String s0 = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        long t = System.currentTimeMillis();
        for(int i=0;i<1000;i++){
            sb.append(s0);
        }
        t = System.currentTimeMillis()-t;
        System.out.println(t);





    }

}
