package a_JavaBean;

public class Team {
    private String teamName;
    private double funds;

    //有参构造

    public Team(String teamName, double funds) {
        if (funds<0){
            throw new IllegalArgumentException("战队资金不能为负数！");
        }
        this.teamName = teamName;
        this.funds = funds;
    }

    public Team() {
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        if (funds<0){
            throw new IllegalArgumentException("战队资金不能为负数");
        }
        this.funds = funds;
    }
}
