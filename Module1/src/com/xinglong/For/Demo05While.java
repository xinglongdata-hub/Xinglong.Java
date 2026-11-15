package com.xinglong.For;
/*
while循环
1.格式：
  初始化变量；
  while（比较）{
        循环语句；
        步进表达式
  }
2.执行流程：
  a.初始化变量
  b.比较，如果是true，就走循环语句，走步进表达式
  c.在比较如果还是true，继续走循环语句，继续走步进表达式
  d.在比较，直到比较为false，循环结束
 */
public class Demo05While {
    public static void main(String[] args) {
        int num = 0;
        int i = 1;
        while(i<100){
            if (i%2==0){
                num+=i ;
            }
            i++;
        }
            System.out.println("num = " + num);
    }
}