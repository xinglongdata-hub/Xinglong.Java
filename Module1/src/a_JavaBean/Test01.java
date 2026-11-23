package a_JavaBean;

public class Test01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("兴龙");
        s1.setSid(1);
        System.out.println(s1.getName()+"......."+s1.getSid());
        System.out.println("=========================");
        Student s2 = new Student("高宇",2);
        System.out.println(s2 .getName()+"......."+s2.getSid());
    }
}
