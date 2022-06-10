package api;
/*包装类*/
public class integer {
    public static void main(String[] args) {
        int i = 1;
        /*基本类型转换为包装类Integer.valueOf*/
        Integer i1 =Integer.valueOf(i);
        System.out.println(i1);
        /*包装类转换为基本。类型*/
        int d =i1.intValue();
    }
}
