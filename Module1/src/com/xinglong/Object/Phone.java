package com.xinglong.Object;

public class Phone {
    //属性
    String brand;//品牌
    String color;//颜色
    int price;//价格
    //行为
    public void call(String name){
        System.out.println("给"+name+"电话");
    }
    public String message(){
        return "给高宇买t";
    }
}
