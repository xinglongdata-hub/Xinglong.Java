package com.xinglong.method;

public class Demo05Method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a,b);//a代表10b代表20传递过去了
        System.out.println("===================================");
        int result = sum(10,20);
        System.out.println("result = " + result);
    }
    public static void method(int a,int b ){//a = 10；b = 20
        System.out.println(a+"....."+b);
    }
    public static int sum(int a,int b){
        int sum =a + b;
        return sum;
    }
}
