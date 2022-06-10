package debug;
/*
* F7 单步调试
* F8  多不调试，不会进到方法体
* alt+shift +F8结束调试
* alt+shift +f7 直接跳到下一个断点（若则直接结束）
  *会看变量
  * 会添加监视（选中表达式右键Watch）
*
*
* */
public class DebugDemo {

    public static void main(String[] args) {
        int a =10;
      int b =2;
        test();
       plus(a,b);
    }
    public static void test(){

        System.out.println(111);
        System.out.println(22);
        System.out.println(33);
    }
 static void plus(int n,int m){
        int c = n+m;
        if(c>10){
            System.out.println(c);
        }
 }




}
