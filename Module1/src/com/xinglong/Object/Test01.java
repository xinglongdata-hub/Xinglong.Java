package com.xinglong.Object;

public class Test01 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        System.out.println(phone1);
        phone1.brand = "xiaomi";
        phone1.color = "白色";
        phone1.price = 2999;
        System.out.println(phone1.brand);
        System.out.println(phone1.color);
        System.out.println(phone1.price);
        phone1.call("张轩浩");
        String message = phone1.message();
        System.out.println(message);
        System.out.println("----------------------------");
        Phone phone2 = new Phone();
        phone2.brand = "huawei";
        phone2.color = "零度白";
        phone2.price = 9999;
        System.out.println(phone2.brand);
        System.out.println(phone2.color);
        System.out.println(phone2.price);


    }
}
