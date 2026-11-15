package com.xinglong.scanner;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        //创建对象
        Scanner lpl = new Scanner(System.in);
        //录入int型整数
        int i = lpl.nextInt();
        System.out.println("i = " + i);

        //录入string型字符串
        Scanner kpl = new Scanner(System.in);
        String k = kpl.next();
        System.out.println("k = " + k);
        


    }
}
