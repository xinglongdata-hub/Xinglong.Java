package com.xinglong.Object;

public class Demo02IPhone {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.brand = "华为";
        iphone.color = "零度白";
        iphone.price = 6999;
        System.out.println("华为");
        System.out.println("零度白");
        System.out.println(6999);
        iphone.call("高宇");
        String mess = iphone.message();
        System.out.println(mess);
    }
}