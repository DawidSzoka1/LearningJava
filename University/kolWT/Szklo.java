package University.kolWT;

public class Szklo  extends Rodzic{
    String nazwa;

    public Szklo(String nazwa) {
        this.nazwa = nazwa;
    }
    @Override
    public String odzysk() {
        return "sqweqwkup";
    }

    @Override
    public String toString() {
        return "Szklo{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
