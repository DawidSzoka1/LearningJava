package University.kol2v2.zad4;

public class LekRef extends Lek{
    private int znizka;

    public LekRef(int znizka) {
        this.znizka = znizka;
    }

    public LekRef(String nazwa, int znizka) {
        super(nazwa);
        this.znizka = znizka;
    }

    public int getZnizka() {
        return znizka;
    }

    public void setZnizka(int znizka) {
        this.znizka = znizka;
    }

    @Override
    public String toString() {
        return "LekRef{" + super.toString() +
                "znizka=" + znizka +
                '}';
    }
}
