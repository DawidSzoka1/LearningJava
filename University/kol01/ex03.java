package University.kol01;

class Samochod{
    private String marka;
    private double pojemnoscSilnika;

    public Samochod(){}
    public Samochod(String fsdf, double pojemnoscSilnika) {
        this.marka = fsdf;
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }
}

class SamochodCiezarowy extends Samochod{
    private double ladownosc;

    public SamochodCiezarowy(){}
    public SamochodCiezarowy(String marka, double pojemnoscSilnika, double ladownosc) {
        super(marka, pojemnoscSilnika);
        this.ladownosc = ladownosc;
    }

    public double getLadownosc() {
        return ladownosc;
    }

    public void setLadownosc(double ladownosc) {
        this.ladownosc = ladownosc;
    }

}
class D{}
public class ex03 {
    public static void main(String[] args) {
        Samochod[] samochods = new Samochod[10];
        samochods[0] = new Samochod();
        samochods[1] = new Samochod();
        samochods[2] = new SamochodCiezarowy("asfd", 123, 21312);
        samochods[3] = new SamochodCiezarowy("zok", 123, 3);
        samochods[4] = new SamochodCiezarowy("asfd", 123, 54);
        double ladMax = 0;
        int index = 0;
        for(Samochod samochod : samochods){
            if(samochod instanceof SamochodCiezarowy){
                SamochodCiezarowy temp =  (SamochodCiezarowy)samochod;
                if(ladMax < temp.getLadownosc()){
                    ladMax = temp.getLadownosc();
                }
            }
        }
        System.out.println(samochods[0]);

    }
}
