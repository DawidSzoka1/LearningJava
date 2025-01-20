package University.kol2v2.zad4;

public class Lek {
    private String nazwa;

    public Lek(){}
    public Lek(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Lek{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
