package com.xinglong.Object;

public class Test02 {
    public static void main(String[] args) {
        Citizen ci = new Citizen();
        ci.name = "石昊";
        ci.idCard = "371323200610142818";
        ci.brithday.year = 2006;
        ci.brithday.month = 10;
        ci.brithday.day = 14;
        System.out.println(ci.name+","+ci.idCard+","+ci.brithday.year+","+ci.brithday.month+","+ci.brithday.day);
    }
}
