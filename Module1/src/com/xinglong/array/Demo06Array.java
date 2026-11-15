package com.xinglong.array;

public class Demo06Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);
        arr[1] = 100;
        arr[2] = 200;
        arr[0] = 300;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("=================================");
        String[] arr2 = new String[3];
        System.out.println(arr2);
        arr2[0] = "张轩浩";
        arr2[1] = "你好呀";
        arr2[2] = "哈喽";
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("=================遍历arr数组=================");
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("===============遍历arr2数组===================");
        for (int k = 0; k < arr2.length; k++) {
            System.out.println(arr2[k]);
        }
    }
}
