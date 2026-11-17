package com.xinglong.method;

public class Demo12OverLoad {
    public static void main(String[] args) {
        sum(10,20);
    }
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void sum(double a,int b){
        System.out.println(a+b);
    }
    public static void sum(int a,double b){
        System.out.println(a+b);
    }
}
