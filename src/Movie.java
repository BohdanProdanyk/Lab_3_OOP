public class Movie {
    private String name;
    private String Gganer;
    private double reinteng;
    private int oldM;
    private double time;
    private int data1;
    private int data2;
    private double cost;

    public Movie(String Gganer, String name, int oldM, double reinteng, double time, int data1, int data2) {
        this.name = name;
        this.Gganer = Gganer;
        this.oldM = oldM;
        this.reinteng = reinteng;
        this.time = time;
        this.data1 = data1;
        this.data2 = data2;
    }









    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost * 2;
    }

    public void setMovie(String movie) {
        this.name = movie;
    }
    public void setOldM(String oldM) {
        this.name = oldM;
    }

    public void setGganer(String gganer) {
        this.Gganer = gganer;
    }

    public void setReinteng(double reinteng) {
        this.reinteng = reinteng;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public String getName() {
        return name;
    }
    public int getOldM() {
        return oldM;
    }

    public String getGganer() {
        return Gganer;
    }

    public double getReinteng() {
        return reinteng;
    }

    public double getTime() {
        return time;
    }

    public int getData1() {
        return data1;
    }

    public int getData2() {
        return data2;
    }


}