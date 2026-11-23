package Recursion;

public class Demo01Recursion {
    public static void main(String[] args) {
        mothod(3);
    }

    public static void mothod(int n) {
        if (n == 1) {
            System.out.println(n);
            //结束方法
            return;
        }
        System.out.println(n);
        n--;
        mothod(n);
    }
}
