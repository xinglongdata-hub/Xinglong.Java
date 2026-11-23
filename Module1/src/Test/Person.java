package Test;

public class Person {
    public static void main(String[] args) {
        Test01 test = new Test01();
        //test.name = "兴龙";
        //test.age = 18;
        //System.out.println("兴龙");
        //System.out.println(18);
        test.setName("兴龙");
        test.setAge(18);
        int age = test.getAge();
        String name = test.getName();
        System.out.println(name+"......"+age);
    }
}
