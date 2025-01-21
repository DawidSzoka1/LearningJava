package University.kol2OficialW1.zad1;

import java.util.ArrayList;
import java.util.List;

public class Panstwo {
    private List<PanstwoMiasta> miasta;
    private String nazwa;

    public Panstwo(){
        miasta = new ArrayList<>();
    }
    public Panstwo(List<PanstwoMiasta> miasta) {
        this.miasta = miasta;
    }
    public Panstwo(String nazwa){
        miasta = new ArrayList<>();
        this.nazwa = nazwa;
    }

    public Panstwo(List<PanstwoMiasta> miasta, String nazwa) {
        this.miasta = miasta;
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void srednia(){
        int sum = 0;
        for(PanstwoMiasta m: miasta){
            sum +=  m.getIlosc();
        }
        System.out.println(sum / (double)miasta.size());
    }

    public List<PanstwoMiasta> getMiasta() {
        return miasta;
    }

    public void setMiasta(List<PanstwoMiasta> miasta) {
        this.miasta = miasta;
    }

    @Override
    public String toString() {
        return "Panstwo{" +
                "miasta=" + miasta +
                '}';
    }
}

