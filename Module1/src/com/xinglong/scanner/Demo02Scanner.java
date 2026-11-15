package com.xinglong.scanner;

import java.util.Scanner;

public class Demo02Scanner {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int old1 = ac.nextInt();
        int old2 = ac.nextInt();
        int old3 = ac.nextInt();
        int temp = old1>old2? old1:old2;
        System.out.println("temp = " + temp);
        int max = temp>old3? temp:old3;
        System.out.println(max);
        
    }
}
