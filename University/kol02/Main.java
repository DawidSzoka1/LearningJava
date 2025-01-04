package University.kol02;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Zamowienie z = new Zamowienie();
        z.dodajProdukt(new Product("nazwa", 32), 4);
        z.dodajProdukt(new Product("name2", 32), 4);
        z.dodajProdukt(new Product("name3", 2), 3);
        z.dodajProdukt(new Product("name4", 10), 1);
        Zamowienie z2 = new Zamowienie();
        z2.dodajProdukt(new Product("nazwa", 1), 2);
        z2.dodajProdukt(new Product("name2", 2), 4);
        Zamowienie z3 = new Zamowienie();
        z3.dodajProdukt(new Product("nazwa", 23), 2);
        z3.dodajProdukt(new Product("name2", 2), 4);
//        System.out.println(z.ilePlacic());
//        z.getProdukty().sort(Pozycja::compareTo);
//        System.out.println(z.getProdukty());

        HistoriaZamowien hm = new HistoriaZamowien();
        hm.addZamowienie(z);
        hm.addZamowienie(z2);
        hm.addZamowienie(z3);
        Iterator<Zamowienie> it = hm.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
