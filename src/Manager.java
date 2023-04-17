public class Manager extends People implements Class {
    private double bouns;

    public Manager() {
    }

    public Manager(String name, int id, double salary, double bouns) {
        super(name, id, salary);
        this.bouns = bouns;
    }

    public Manager(double bouns) {
        this.bouns = bouns;
    }

    /**
     * 获取
     *
     * @return bouns
     */
    public double getBouns() {
        return bouns;
    }

    /**
     * 设置
     *
     * @param bouns
     */
    public void setBouns(double bouns) {
        this.bouns = bouns;
    }


    @Override
    public void work() {
        System.out.println("guanli");
    }

    public String toString() {
        return "Manager{bouns = " + bouns + "}";
    }

}
