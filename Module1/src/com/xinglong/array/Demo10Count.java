package com.xinglong.array;

import java.util.Random;

public class Demo10Count {
    public static void main(String[] args) {
        Random re = new Random();
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = re.nextInt(101);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                count++;
            }
        }
        System.out.println("count = " + count);

    }
}
