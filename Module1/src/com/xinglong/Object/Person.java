package com.xinglong.Object;

public class Person {
    public static void main(String[] args) {
        Demo01Object a = new Demo01Object();
        a.name = "金莲";
        a.age = 26;
        System.out.println(a.name);
        System.out.println(a.age);
        a.eat();
        a.sleep();
    }
}
