package Test;

public class JavaBean02 {
    private String name;
    private int age;
    //无参构造
    public JavaBean02(){

    }
    //有参构造
    public JavaBean02(String name,int age){
        this.name = name;
        this.age  =age;
    }

    public void setNmae(String nmae) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
