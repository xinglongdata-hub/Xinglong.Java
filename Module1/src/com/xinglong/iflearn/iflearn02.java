package com.xinglong.iflearn;

import java.util.Scanner;

public class iflearn02 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int data = ac.nextInt();
        if (data%2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }


    }
}
