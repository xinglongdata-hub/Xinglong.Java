package a_JavaBean;

public class Main {
    public static void main(String[] args) {
        Team t1  = new Team("EDG",100000);
        System.out.println(t1.getTeamName()+"资金"+t1.getFunds());
        //触发异常
        Team t2 = new Team("AUG",-100000);
    }
}
