package com.xinglong.switchlearn;

import java.util.Scanner;

public class Demo03switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {
            case 12:
                System.out.println("陈双圆你要干什么");
            case 1:
                System.out.println("能不能学点习");
            case 2:
                System.out.println("我是害你吗");
            case 3:
                System.out.println("叫你学点习比绕地球一圈嗨难");
            case 4:
                System.out.println("我真的受不了");
            case 5:
                System.out.println("你再这样下去");
            case 6:
                System.out.println("哈哈哈");
            case 7:
                System.out.println("绷不住了");
            case 8:
                System.out.println("结束了");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
            default:
                System.out.println("什么情况，你家有这个月份？");
                break;
        }
    }

}
