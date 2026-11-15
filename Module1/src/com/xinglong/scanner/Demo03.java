package com.xinglong.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        /*
        如果是next输出“哈哈 呵呵”，输出的结果只会是哈哈空格后边的不会输出，如果是nextLine就不会出现以上问题
         */
        String data1 = cl.nextLine();
        System.out.println("data1 = " + data1);
    }
}
