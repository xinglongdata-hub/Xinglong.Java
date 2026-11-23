package a_JavaBean;

public class Test02 {
    public static void main(String[] args) {
        Student02 s1 = new Student02();
        Student02.classroom = "222";
        s1.name = "兴龙";
        s1.age = 20;
        System.out.println(s1.name+","+s1.age+","+Student02.classroom);
        System.out.println("===================");
        Student02 s2 = new Student02();
        s2.name = "高宇";
        s2.age = 20;
        System.out.println(s2.name+","+s2.age+","+Student02.classroom);
    }
}
