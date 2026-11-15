package com.xinglong.switchlearn;

import java.util.Scanner;
/*
case的穿透性
1.如果没有break，就会出现case的穿透性，程序就一直往下穿透执行，直到遇到break或者switch代码执行完毕就停止了
 */
public class Demo02switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        switch (data) {
            case 1:
                System.out.println("窗前明月光");
            case 2:
                System.out.println("疑是地上霜");
            case 3:
                System.out.println("举头望明月");
            case 4:
                System.out.println("低头思故乡");
                break;
            default:
                System.out.println("下面没有了");
                break;
        }


    }
}
