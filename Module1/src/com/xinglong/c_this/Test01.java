package com.xinglong.c_this;

public class Test01 {
    public static void main(String[] args) {
        person per = new person();
        System.out.println(per+"|||||||||||||||");
        per.name = "沉香";
        per.speak("刘彦昌");
        System.out.println("==================");
        person person2 = new person();
        System.out.println(person2+"____________");
        person2.name = "奥特曼";
        person2.speak("奥特曼之父");
    }
}
