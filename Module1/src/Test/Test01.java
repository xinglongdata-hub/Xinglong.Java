package Test;

public class Test01 {
    private String name;
    private int age;
    //为name提供set和get方法
    public void setName(String xingming){
        name = xingming;
    }
    public String getName( ){
        return name;
    }
    public void setAge(int nianling){
        if (nianling>0 && nianling<150){
        }else {
            System.out.println("你脑子有病");
        }
            age = nianling;
    }
    public int getAge(){
        return age;
    }
}
