package University.kolWT;

public class Papier  extends Rodzic{
    String name;
    public Papier(String name) {
        this.name = name;
    }
    @Override
    public String odzysk() {
        return "paoier";
    }

    @Override
    public String toString() {
        return "Papier{" +
                "name='" + name + '\'' +
                '}';
    }
}
