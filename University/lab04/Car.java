package University.lab04;

public class Car {
    private String make;
    private int year;
    private String type;
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }
    public Car(String make, int year, String type) {
        this.make = make;
        this.year = year;
        this.type = type;
    }
    public Car(){}

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                '}';
    }
}
