package com.xinglong.array;

import java.util.Random;
//随机产生10个【0，100】之间整数，统计即是3又是5，但不是7的倍数的个数

public class Demo08lianxi {
    public static void main(String[] args) {
        //1 创建Random对象，用于生成随机数
        Random rd = new Random();
        //2 定义一个数组，长度为10
        int[] arr = new int[10];
        //3 定义个变量count，用于统计符合条件的数组个数
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(101);

        }
        //4 遍历数组，判断元素是否符合条件，如果符合，count++
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0 && arr[i]%5==0 && arr[i]%7!=0){
                System.out.println("count = " + count);
            }

        }

        //5 输出count
    }
}
