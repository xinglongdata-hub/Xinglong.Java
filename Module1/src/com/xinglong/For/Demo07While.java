package com.xinglong.For;

public class Demo07While {
    public static void main(String[] args) {
        int num = 0;
        int k = 1;
        while (k<300){
            if (k%2==0){
                num+=1;
            }
            k++;
        }
        System.out.println("num = " + num);

    }
}
