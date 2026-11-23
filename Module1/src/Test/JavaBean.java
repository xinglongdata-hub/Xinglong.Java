package Test;

public class JavaBean {
    private String name;
    private int age;
    //无参构造
    public JavaBean(){

    }
    //有参构造
    public JavaBean(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int nianling){
        if (nianling<0 && nianling>150){
            System.out.println("你脑子有病");
        }else {
            age = nianling;
        }
        age = nianling;
    }
    public int getAge(){
        return age;
    }

}
