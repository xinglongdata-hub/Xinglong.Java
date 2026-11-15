package com.xinglong.random;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random re = new Random();
        //0 - 10
        int i = re.nextInt(5)+1;
        System.out.println("i = " + i);
    }
}
