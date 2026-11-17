package com.xinglong.method;

public class Demo11Method {
    public static void main(String[] args) {
        int[] arr2 = method();//int arr2 = arr1
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
    public static int[] method(){
        int a = 30;
        int b = 100;
        int sum = a + b;
        int sub = a - b;
        int[] arr1 = {sum,sub};
        return arr1;
    }
}
