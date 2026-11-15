package com.xinglong.iflearn;

import java.util.Scanner;

public class iflearn04lianxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建scanner对象，调用nextint键盘录入一个年份year
        int year = sc.nextInt();
        //判断（year%4==0 && year%100！= 0 ）｜｜（year%400==0）
        if(( year%4==0 && year%100!=0 )||(year%400==0)){
            //如果条件成立则输出“闰年2月29天”，如果条件不成立则输出“平年28天”
            System.out.println("闰年2月29天");
        }else {
            System.out.println("平年28天");
        }


    }
}
