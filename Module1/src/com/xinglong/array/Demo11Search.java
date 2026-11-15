package com.xinglong.array;

import java.util.Scanner;

public class Demo11Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {11,22,33,44,55,66,77,88};
        System.out.println("请输入你要查找的数");
        int data = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (data==arr[i]){
                System.out.println("i = " + i);
                flag++;
            }

        }
        if (flag==0){
            System.out.println("找不到");
        }

    }
}
