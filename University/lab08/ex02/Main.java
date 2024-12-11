package University.lab08.ex02;

public class Main {
    public static <T extends Number> boolean porownajPoZa(KlasaN<T> n, KlasaN<T> n2){
        return n.porownaj(n2);
    }
    public static void main(String[] args) {
        KlasaN<Integer> kl = new KlasaN<>(new Integer[]{4, 4});
        KlasaN<Integer> kl2 = new KlasaN<>(new Integer[]{4, 4, 4});
        System.out.println(kl2.avg());
        System.out.println(kl.avg());
        System.out.println(porownajPoZa(kl, kl2));
    }
}
