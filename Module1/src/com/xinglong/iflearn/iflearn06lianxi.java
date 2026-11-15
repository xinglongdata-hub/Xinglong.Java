package com.xinglong.iflearn;

import java.util.Scanner;

public class iflearn06lianxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day==1){
            System.out.println("周一");
        } else if (day==2) {
            System.out.println("周二");
        } else if (day==3) {
            System.out.println("周三");
        } else if (day==4) {
            System.out.println("周四");
        } else if (day==5) {
            System.out.println("周五");
        } else if (day==6) {
            System.out.println("周六");
        } else if (day==7) {
            System.out.println("周日8");
        }else{
            System.out.println("是不是有点大病");
        }


    }
}
