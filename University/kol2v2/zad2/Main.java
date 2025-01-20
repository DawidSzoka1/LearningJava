package University.kol2v2.zad2;

public class Main {
    public static void main(String[] args) {
        Kraj Polska = new Kraj();
        Miasto bia = new Miasto(new Liczba(100), new Nazwa("bia"));
        Miasto m1 = new Miasto(new Liczba(100 *3), new Nazwa("bia"));
        Miasto m2 = new Miasto(new Liczba(100 * 2), new Nazwa("bvc"));
        Miasto m3 = new Miasto(new Liczba(100 *321), new Nazwa("vxcv"));
        Miasto m4 = new Miasto(new Liczba(100 * 9), new Nazwa("afd"));
        Polska.addMiasto(bia);
        Polska.addMiasto(m1);
        Polska.addMiasto(m2);
        Polska.addMiasto(m3);
        Polska.addMiasto(m4);
        System.out.println(Polska);
    }
}
