package com.xinglong.c_this;

public class person {
    String name;
    public void speak(String name){
        System.out.println(this+"................");
        System.out.println(this.name+"你好，我是"+name);
    }
}
