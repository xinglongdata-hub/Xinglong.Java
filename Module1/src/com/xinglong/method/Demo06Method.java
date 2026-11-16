package com.xinglong.method;

public class Demo06Method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean result = compare (a,b);
        System.out.println("result = " + result);
    }
    public static boolean compare (int a,int b){
        if (a>b){
            return true;
        }else{
            return false;
        }
    }
}
