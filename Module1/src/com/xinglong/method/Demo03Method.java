package com.xinglong.method;

public class Demo03Method {
    public static void main(String[] args) {
        //打印调用
        System.out.println("sum = " + sum());
        //赋值调用
        int result = sum();
        System.out.println("result = " + result);
    }
    public static int sum(){
        int a = 10;
        int b = 10;
        int sum = a+b;
        return sum;
    }
}
