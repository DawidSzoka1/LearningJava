package University.lab04;

public class Car {
    private String make;
    private int year;
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }
    public Car(){}

    @Override
    public String toString() {
        return  make  +
                " " + year;
    }
}
