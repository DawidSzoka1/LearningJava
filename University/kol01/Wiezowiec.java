package University.kol01;

public class Wiezowiec extends Budynek{

    public Wiezowiec(String typ, int rokB, String lokalizacja, int iloscPi) {
        super(typ, rokB, lokalizacja, iloscPi);
    }

    @Override
    void transport() {
        System.out.println("jedz winda");
    }
}
