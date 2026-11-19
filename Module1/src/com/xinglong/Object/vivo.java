package com.xinglong.Object;

public class vivo {
    public static void main(String[] args) {
        Demo03vivo vivo = new Demo03vivo();
        vivo.name = "苹果18promax";
        vivo.brand = "苹果";
        vivo.price = 9999;
        System.out.println("苹果18promax");
        System.out.println("苹果");
        System.out.println(9999);
        vivo.csll("张轩浩");
        String message = vivo.message();
        System.out.println(message);
    }
}
