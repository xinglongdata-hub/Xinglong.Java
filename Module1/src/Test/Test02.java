package Test;

public class Test02 {
    public static void main(String[] args) {
        JavaBean message = new JavaBean();
        message.setAge(20);
        message.setName("兴龙");
        String name = message.getName();
        int age = message.getAge();
        System.out.println("姓名："+name+"   "+"年龄："+age);
    }
}
