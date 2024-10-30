package University.lab04;

public class Gasoline extends Car{
    private String type;

    public Gasoline(String make, int year, String type) {
        super(make, year);
        this.type = type;
    }

    public Gasoline() {
    }

    @Override
    public String toString() {
        return super.toString() + ", " + type;
    }
}
