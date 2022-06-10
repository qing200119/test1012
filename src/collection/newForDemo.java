package collection;
/***jdk5推出的新for,遍历集合和数组
 * 编译器认可，虚拟机不认可
 * 最后编译器还是会重新编译成传统for循环*/
public class newForDemo {
    public static void main(String[] args) {
      String[] array ={"df","def","fsdv","sf"};
      for(String str:array){
          /**新循环不能够中断，定义长度，
           * 只能在集合和数组*/
          System.out.println(str);
      }

    }
}
