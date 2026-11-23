package a_JavaBean;

public class Demo03Var {
    public static void main(String[] args) {
        String concat = concat("-", "唐三", "石昊", "萧炎");
        System.out.println("concat = " + concat);
    }
    public static String concat(String a,String...s){
        String str = "";
        for (int i = 0; i < s.length; i++) {
            if (i == s.length-1) {
                str += s[i];
            }else{
                str += s[i]+a;
            }
        }
        return str;
    }
}
