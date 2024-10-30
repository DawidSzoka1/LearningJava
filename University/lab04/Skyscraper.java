package University.lab04;

public class Skyscraper extends Building{
    public Skyscraper() {
    }

    public Skyscraper(int counstructYear, String localization, int floorAmount) {
        super("Skyscraper", counstructYear, localization, floorAmount);
    }

    @Override
    void transport() {
        System.out.println("jedz winda");
    }
}
