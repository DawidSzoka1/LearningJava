package University.kolWT;

public class Kadry {
    private Pracownik[] pracownicy;
    public Kadry() {
        pracownicy = new Pracownik[100];
    }
    public Kadry(int rozmiar){
        if(rozmiar > 100){
            pracownicy = new Pracownik[100];
        }else {
            pracownicy = new Pracownik[rozmiar];
        }
    }

    public void addPracownicy(Pracownik p){
        int i = 0;
        while(pracownicy[i] != null && i < pracownicy.length){
            i++;
        }
        if(pracownicy[i] == null){
            pracownicy[i] = p;
            System.out.println("DODANO");
        }else{
            System.out.println("NIE DODANO");
        }
    }

    public double srednieZarobki(){
        int i = 0;
        double sum =0;
        while(pracownicy[i] != null && i < pracownicy.length){
            sum += pracownicy[i].getPlaca();
            i++;
        }
        return sum/(i+1);
    }

    public double srednieZarobki(int dzial){
        int i = 0;
        int j = 0;
        double sum = 0;
        while(pracownicy[i] != null && i < pracownicy.length){
            if(pracownicy[i].czyPracujeWdziale(dzial)) {
                sum += pracownicy[i].getPlaca();
                j ++;
            }
            i++;
        }
        return sum/(j+1);
    }

    public int[] dajDzialy(){
        int[] wynik = new int[pracownicy.length];
        int i = 0;
        while(i < pracownicy.length && pracownicy[i] != null){
            wynik[i] = pracownicy[i].getDzial();
            i++;
        }
        return wynik;
    }
}
