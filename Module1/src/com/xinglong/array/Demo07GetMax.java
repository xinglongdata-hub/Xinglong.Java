package com.xinglong.array;

public class Demo07GetMax {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,};
        //定义一个Max，接收比较后较大值的数
        int max = arr[0];
        //遍历数组后，将每个元素提取出来比较
        for (int i = 0; i < arr.length; i++) {
            //判断如果max小于遍历出来的元素，证明遍历出来的元素大，在将遍历出来的数重新赋值给Max
            if (max<arr[i]){
                max=arr[i];
            }

        }
        //直接输出Max
        System.out.println("max = " + max);

    }
}
