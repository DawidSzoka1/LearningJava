package University.kolWT;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private double placa;
    private int dzial;

    public Pracownik() {}
    public Pracownik(String imie, String nazwisko, double placa, int dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.placa = placa;
        this.dzial = dzial;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getPlaca() {
        return placa;
    }

    public void setPlaca(double placa) {
        this.placa = placa;
    }

    public int getDzial() {
        return dzial;
    }

    public void setDzial(int dzial) {
        this.dzial = dzial;
    }

    public boolean czyPracujeWdziale(int dzial) {
        return this.dzial == dzial;
    }


    @Override
    public String toString() {
        return imie + " " + nazwisko + ", " + placa + " zl, dzial " + dzial + ";";
    }
}
