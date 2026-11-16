package com.xinglong.method;

public class Demo04Method {
    public static void main(String[] args) {
        int sum = sum(10, 20);
    }
    public static int sum(int a,int b) {
        int sum = a + b;
        System.out.println("sum = " + sum);
        return sum;
    }
}
