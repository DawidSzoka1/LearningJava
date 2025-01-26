package University.kombajn.zad1;

import java.util.ArrayList;
import java.util.List;

public class HistoriaZam {
    private List<Zamownienie> zamowienia;

    public HistoriaZam(){
        zamowienia = new ArrayList<>();
    }

    public HistoriaZam(List<Zamownienie> zamowienia) {
        this.zamowienia = zamowienia;
    }

    public List<Zamownienie> getZamowienia() {
        return zamowienia;
    }

    public void setZamowienia(List<Zamownienie> zamowienia) {
        this.zamowienia = zamowienia;
    }

    public static Zamownienie najmniejszaIlosc(HistoriaZam historiaZam){
        Zamownienie zamownienie = historiaZam.getZamowienia().get(0);
        int iloscMin = zamownienie.iloscProdukt();
        for(Zamownienie z: historiaZam.getZamowienia()){
            int check = z.iloscProdukt();
            if(check < iloscMin){
                iloscMin = check;
                zamownienie = z;
            }
        }
        return zamownienie;
    }

    @Override
    public String toString() {
        return "HistoriaZam{" +
                "zamowienia=" + zamowienia +
                '}';
    }
}
