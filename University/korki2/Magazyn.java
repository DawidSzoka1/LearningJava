package University.korki2;

public class Magazyn {
    private Element[] tab = new Element[100];

    Magazyn(){}

    void metod(){
        for(int i =0; i<tab.length; i++){
           tab[i].metoda();
        }
    }
}
