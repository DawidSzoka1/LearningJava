package University.kolWT;

public class Metal extends Rodzic{
    String name;

    @Override
    public String toString() {
        return "Metal{" +
                "name='" + name + '\'' +
                '}';
    }



    public Metal(String name) {
        this.name = name;
    }
}
