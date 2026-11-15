package com.xinglong.iflearn;

import java.util.Scanner;

/*
   1.if第一种格式
     if（boolean表达式）{
     执行语句：
     }
   2.执行流程：
     先走if后边的boolean表达式，如果是tru e，就走if后边大括号的执行语句，否则就不走。
   3.注意：
     if后边跟的是boolean表达式，只要结果是boolean型的，都可以放在小括号中，哪怕只写一个true或者false


     if的第二种格式
     if（boolean表达式）{
         执行语句1
     }else{
         执行语句2
     }
     执行流程；
     1.先走if后边的布尔表达式，如果是true就走if后边的执行语句1，否则就走else后边的执行语句2
     if的第三种格式
     if（boolean表达式）{
       执行语句1
     }else if(boolean表达式){
       执行语句2
     } else if(boolean表达式){
       执行语句3
     }...else{
       执行语句n
     }
     执行流程
     从if开始挨个忘下判断，哪个if结果为true，就走哪个if对应的执行语句，如果所有的判断都是false，就走else对应的执行语句n
 */
public class iflearn01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        if (data1 == data2) {
            System.out.println("两个整数相等");
        } else {
            System.out.println("两个整数不相等");
        }

    }

}