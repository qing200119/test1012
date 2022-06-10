package list;

import java.util.ArrayList;
import java.util.List;

/**list sublist (int start int end)
 * 获取指定范围的元素
 * 对子集元素操作，相应的原集合也会改变
 *
 * */
public class subListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        List<Integer> sublist =list.subList(3,8);
        /**把子集元素扩大十倍*/
        for(int i=0;i<sublist.size();i++){
            sublist.set(i,sublist.get(i)*10);
        }

        System.out.println(sublist);
        System.out.println(list);




    }}
