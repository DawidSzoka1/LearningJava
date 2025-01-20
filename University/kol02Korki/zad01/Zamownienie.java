package University.kol02Korki.zad01;

import java.util.ArrayList;
import java.util.List;

public class Zamownienie {
    private List<ProduktZamownia> produkty;

    public Zamownienie() {
        produkty = new ArrayList<>();
    }

    public Zamownienie(List<ProduktZamownia> produkty) {
        this.produkty = produkty;
    }

    public List<ProduktZamownia> getProdukty() {
        return produkty;
    }
    public void add(ProduktZamownia p) throws WlasnyWyjatek {
        if(p.getIlosc() <= 0){
            throw new WlasnyWyjatek("moj wyjatek");
        }else if(ilePlacic() > 100){
            throw new WlasnyWyjatek("Wiecej niz 100");
        }
        produkty.add(p);
    }

    public void setProdukty(List<ProduktZamownia> produkty) {
        this.produkty = produkty;
    }
    public double ilePlacic(){
        double sum = 0;
        for(int i = 0; i < produkty.size(); i++){
            sum += produkty.get(i).getIlosc() * produkty.get(i).getP().getCena();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Zamownienie{" +
                "produkty=" + produkty +
                '}';
    }
}
