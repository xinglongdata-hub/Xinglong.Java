package a_JavaBean;

public class Student {
    private String name;
    private int sid;

    public Student() {
    }

    public Student(String name, int sid) {
        this.name = name;
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
