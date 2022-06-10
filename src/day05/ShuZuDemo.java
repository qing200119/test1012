package day05;

import java.util.Arrays;

public class ShuZuDemo {
    public static void main(String[] args) {

    int [] a= { 10,20 ,40, 50};
    int [] b = new int[5];
    System.arraycopy(a,0,b,2,3);//copy
        // 灵活性好
        // a 原数组
        // 0 原数组的起始下标
        // b 目标数组
        // 2 目标数组的起始下标
        // 3 要复制的元素个数
        for (int i =0 ;i<b.length;i++) {
            System.out.println(b[i]);
        }
        //a 为原数组，c为目标数组
        //若目标数组长度大于源数组长度，则末尾补默认值
        //若目标数组长度小于源数组长度，则末尾截取
        int [] c= Arrays.copyOf(a,6);//6目标数组的长度
        //数组的扩容
        a= Arrays.copyOf(a,a.length+1);//数组的扩容
        //数组的扩容指的是又创建的一个新的更大的数组，并且把数据复制进去
        //数组在内存中的空间是连续的

        //java 排序 Arrays.sort（arr）升序排序




        //数组是一种引用类型，是根据相同数据类型的集合

        int[] arr = new int[3];
         for (int i=0; i<3;i++)
         {
             arr[i]=(int)(Math.random()*100);//(0~100）
             //Math.random()生成随机数
             System.out.println(arr[i]);
         }
        int max = arr[0];
         for (int i=1; i<arr.length; i++)
         {
             if (arr[i]>max)
             {
                 max=arr[i];
             }
         }
        System.out.println("最大值："+max);
        arr =Arrays.copyOf(arr,arr.length+1);//数组扩容
        arr[arr.length-1]= max;

       for(int i=0; i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
    }

}
