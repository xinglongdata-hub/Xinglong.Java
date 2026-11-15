package com.xinglong.array;

public class Demo14Array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] newarr = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newarr[i]=arr1[i];
        }
        //int len = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            newarr[arr1.length+i] = arr2[i];
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }

    }
}
