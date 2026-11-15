package com.xinglong.iflearn;

import java.util.Scanner;

public class iflearn05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        if (data1>data2){
            System.out.println("data1>data2");
        }else if (data1<data2){
            System.out.println("data1<data2");
        } else {
            System.out.println("data1=data2");
        }

    }
}
