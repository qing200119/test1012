package collection;
/**泛型是编译器认可虚拟机不认可
 * 编译器将泛型改为Object，所以泛型实际上还是object
 *编译器行为
 * 1对泛型进行设置值，编译器会检查是否与泛型一致
 * 不一致修改
 * */
public class typeDemo2 {
    public static void main(String[] args) {
     location<Integer> loc1 = new location<Integer>(1,2);
      loc1.setX(3);
      //loc1.setX("1");//不通过
        /*编译器自动拆箱*/
        System.out.println("loc1"+loc1);
        location loc2 =loc1;//不指定类型，只能默认object
        loc2.setX("sdf");
        System.out.println("loc2"+loc2);




    }
}
