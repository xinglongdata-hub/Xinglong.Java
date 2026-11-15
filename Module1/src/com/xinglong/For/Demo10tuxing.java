package com.xinglong.For;

public class Demo10tuxing {
    public static void main(String[] args) {
        //外层控制行
        for (int i = 0; i < 5; i++) {
            //内层控制列
            for (int k = 0; k < 9; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
