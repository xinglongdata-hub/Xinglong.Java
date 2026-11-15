package com.xinglong.array;

public class Demo13Array {
    public static void main(String[] args) {
        int[] oldarr = {1,2,3,4,5};
        int[] newarr = new int[10];
        for (int i = 0; i < oldarr.length; i++) {
            newarr[i]=oldarr[i];
        }
        oldarr=newarr;
        System.out.println(oldarr.length);
        for (int i = 0; i < oldarr.length; i++) {
            System.out.print(oldarr[i]);
        }
    }
}
