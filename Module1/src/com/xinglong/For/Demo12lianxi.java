package com.xinglong.For;

import java.util.Random;
import java.util.Scanner;

public class Demo12lianxi {
    public static void main(String[] args) {
        //创建scanner和random对象
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        //调用random中0-100中的随机一个数   rdnumber
        int rdNumber = rd.nextInt(100) + 1;
        //给自己写挂
        while (true) {
            //调用scannei中的nextint（）方法，键盘录入一个想猜的数    scnumber
            System.out.println("请您猜一个数");
            int scNumber = sc.nextInt();
            //如果scnumber>rdnumber，证明猜大了
            if (scNumber > rdNumber) {
                System.out.println("对不起，徐赫你猜大了，你个low包");
            } else if (scNumber < rdNumber) {
                //如果scNumber<rdNumber，证明猜小了
                System.out.println("对不起，徐赫你猜小了，你怎么那么笨");
            } else {
                //如果scNumber等于rdNumber，整明您猜对了
                System.out.println("恭喜你徐赫，终于才对了");
                break;
            }
        }
    }
}
