package com.xinglong.For;

public class Demo04For {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                num+=1;
            }
        }
            System.out.println(num);
    }
}
