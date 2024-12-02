package University.kol01;

abstract class Budynek {
    String typ;
    int rokB;
    String lokalizacja;
    int iloscPi;
    Budynek(String typ, int rokB, String lokalizacja, int iloscPi) {
        this.typ = typ;
        this.rokB = rokB;
        this.lokalizacja = lokalizacja;
        this.iloscPi = iloscPi;
    }

    void info(){
        System.out.println("Typ: " + typ + " " + rokB);
    }

    abstract void transport();
}
