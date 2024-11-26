package University.kolWT;

public class Kosz {
    public static void main(String[] args) {
        Rodzic[] kosz = new Rodzic[6];
        kosz[0] = new Papier("papierowa gazeta");
        kosz[1] = new Papier("papierowa gazeta");
        kosz[2] = new Szklo("szklana butelka");
        kosz[3] = new Szklo("szklana butelka");
        kosz[4] = new Szklo("szklana butelka");
        kosz[5] = new Metal("metalowa puszka");

        for(int i = 0; i < kosz.length; i++){
            System.out.println(kosz[i].odzysk());
        }

    }

}
