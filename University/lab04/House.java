package University.lab04;


public class House extends Building {
    public House() {
    }

    public House(int counstructYear, String localization, int floorAmount) {
        super("House", counstructYear, localization, floorAmount);
    }

    @Override
    void transport() {
        System.out.println("idz schodami");
    }
}
