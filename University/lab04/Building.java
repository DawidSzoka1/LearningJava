package University.lab04;

public abstract class Building {
    private String type;
    private int counstructYear;
    private String localization;
    private int floorAmount;

    public Building() {
    }

    public Building(String type, int counstructYear, String localization, int floorAmount) {
        this.type = type;
        this.counstructYear = counstructYear;
        this.localization = localization;
        this.floorAmount = floorAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCounstructYear() {
        return counstructYear;
    }

    public void setCounstructYear(int counstructYear) {
        this.counstructYear = counstructYear;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public int getFloorAmount() {
        return floorAmount;
    }

    public void setFloorAmount(int floorAmount) {
        this.floorAmount = floorAmount;
    }

    abstract void transport();
    void info(){
        System.out.println(localization + " " + counstructYear + " " + type + " " + floorAmount);
    }
}
