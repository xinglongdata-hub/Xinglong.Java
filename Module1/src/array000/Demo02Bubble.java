package array000;

import java.util.Arrays;

public class Demo02Bubble {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("排序前的数组");
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length - 1; j++) {//外层：控制“轮数”
            for (int i = 0; i < arr.length - 1 - j; i++) {//内层：控制“每轮比几次”
                if (arr[i] > arr[i + 1]) {//前一个比后一个大吗
                    int temp = arr[i];//暂存前面
                    arr[i] = arr[i + 1];//后面的放到前面
                    arr[i + 1] = temp;//暂存的放到后边
                }
            }//内层结束
        }//外层结束
        System.out.println("排序后的数组");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        //System.out.println(Arrays.toString(arr));
        }
    }
}