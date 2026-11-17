package com.xinglong.method;

//在main方法中定义一个数组，传递到另外一个方法中，在此方法中遍历数组
public class Demo10Method {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,};
        method(arr1);
    }
    public static void method(int[] arr2 ){
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
