package University.kombajn.zad2;

public class Nazwa {
    private String nazwa;

    public Nazwa(String nazwa) {
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
        return  nazwa;
    }
}
