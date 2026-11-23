package a_JavaBean;

public class EsportsPlayer {
    private String name;
    private String rank;

    public EsportsPlayer(String name, String rank) {//手敲有参构造
        this.name = name;
        this.rank = rank;
    }

    public EsportsPlayer() {//无参构造
    }
    //get/set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}