package University.kombajn.zad4;

public class LekRef extends Lek{
    private int zznizka;
    public LekRef(String nazwa, int zznizka) {
        super(nazwa);
        this.zznizka = zznizka;
    }

    public int getZznizka() {
        return zznizka;
    }

    public void setZznizka(int zznizka) {
        this.zznizka = zznizka;
    }

    @Override
    public String toString() {
        return "LekRef{" +
                "zznizka=" + zznizka +
                '}';
    }
}
