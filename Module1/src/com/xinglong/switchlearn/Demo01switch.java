package com.xinglong.switchlearn;

import java.util.Scanner;

/* 1.格式
     switch（变量）{
         case 常量1：
            执行语句1；
            break;
         case 常量2:
            执行语句2;
            break；
            default：
            执行语句n;
            breeak;
       }
      2. 执行流程：
       用变量接收的值和下面case后面的常量值匹配，匹配到哪个case就执行哪个case对应的执行语句。
       如果以上case都没有匹配上，就走default对应执行语句n
      3. break关键字：代表的是结束switch语句
      4.注意： swich能匹配什么类型的数据
      byte short int char 枚举类型 string类型（）


 */
public class Demo01switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int data = sc.nextInt();
        switch (data) {
            case 1:
                System.out.println("鹅鹅鹅");
                break;
            case 2:
                System.out.println("曲项向天多");
                break;
            case 3:
                System.out.println("白毛浮绿水");
                break;
            case 4:
                System.out.println("红掌拨清波");
                break;
            default:
                System.out.println("下面没有了");
                break;
        }
    }
}
