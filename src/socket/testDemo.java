package socket;

import java.util.Arrays;

/**
 * 测试删除数组元素的逻辑
 */
public class testDemo {
    public static void main(String[] args) {
        int[] allOut = {1, 2, 3, 4, 5, 6};
        int pw = 3;
        for (int i = 0; i < allOut.length; i++) {
            if (pw == allOut[i]) {
                allOut[i] = allOut[allOut.length - 1];
                allOut = Arrays.copyOf(allOut, allOut.length - 1);//缩容
                break;
            }
        }
        allOut = Arrays.copyOf(allOut, allOut.length - 1);//缩容
        System.out.println("不在数组中");
        System.out.println(Arrays.toString(allOut));
    }
}
