package com.xinglong.For;

public class Demo03Fro {
    public static void main(String[] args) {
            int num = 0;
        for (int i = 1; i <= 100; i++) {
            if ( i%2 ==1 ){
                num +=i;
            }


        }
            System.out.println("num = " + num);
    }
}
