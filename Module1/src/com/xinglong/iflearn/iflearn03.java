package com.xinglong.iflearn;

import java.util.Scanner;

public class iflearn03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 10;
        int w = 20;
        int j = 30;
        int emp = 0;
        if (i>w){
            emp=i;
        }else{
            emp=w;
        }
        if(emp>j){
            System.out.println(emp);
        }else {
            System.out.println(j);
        }

    }
}
