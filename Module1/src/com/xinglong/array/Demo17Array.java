package com.xinglong.array;

public class Demo17Array {
    public static void main(String[] args) {
        String[][] arr = new String[2][2];
        arr[0][0] = "hello";
        arr[0][1] = "Claude";
        arr[1][0] = "codex";
        arr[1][1] = "DeepSeek";
        //System.out.println(arr[0][0]);
        //System.out.println(arr[0][1]);
        //System.out.println(arr[1][0]);
        //System.out.println(arr[1][1]);
        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            //arr[i]代表的是一维数组
            for (int k = 0; k < arr.length; k++) {
                System.out.println(arr[i][k]);

            }
        }
    }
}
