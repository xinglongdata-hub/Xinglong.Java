package Recursion;

public class Demo02Recursion {
    public static void main(String[] args) {
        int mothod = mothod(3);
        System.out.println("mothod = " + mothod);
    }
    public static int mothod(int n){
        if (n==1){
            return 1;
        }
        return n*mothod(n-1);

    }
}
