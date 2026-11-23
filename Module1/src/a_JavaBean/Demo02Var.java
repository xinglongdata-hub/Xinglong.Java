package a_JavaBean;

public class Demo02Var {
    public static void main(String[] args) {
        String concat = concat("唐三", "石昊", "萧炎");
        System.out.println("concat = " + concat);
    }
    public static String concat(String...a){
        String str = "";
        for (int i = 0; i < a.length; i++) {
            str+=a[i];
        }
        return str;
    }
}