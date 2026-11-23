package Recursion;

public class Demo03Recursion {
    public static void main(String[] args) {
        int method = method(12);
        System.out.println("method = " + method);
    }
    public static int method(int n){
        if ( n==1 || n==2){
            return 1;
        }
        return  method(n-2)+method(n-1);
    }
}
