package University.kol2v2.zad3;

public class Slowo {
    private String wyraz;

    public Slowo(){}
    public Slowo(String wyraz) {
        this.wyraz = wyraz;
    }

    public String getWyraz() {
        return wyraz;
    }

    public void setWyraz(String wyraz) {
        this.wyraz = wyraz;
    }

    @Override
    public String toString() {
        return wyraz;
    }
}
