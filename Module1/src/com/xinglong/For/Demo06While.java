package com.xinglong.For;

public class Demo06While {
    public static void main(String[] args) {
        int mountain =  8844430;
        double paper = 0.1;
        int count = 0;
        while (paper<mountain){
            paper*=2;
        count++;
        }
        System.out.println("count = " + count);
    }
}
