package University.kol02Korki.zad3;

import University.kol02Korki.zad01.Zamownienie;

import java.util.Iterator;

public class IterotorZamowien implements Iterator<Zamownienie> {
    int index = 0;
    Zamownienie[] zamownienies;

    public IterotorZamowien(Zamownienie[] zamownienies) {
        this.zamownienies = zamownienies;
    }

    @Override
    public boolean hasNext() {
//        for(int i = index; i < zamownienies.length; i++){
//            if(zamownienies[i] != null && zamownienies[i].ilePlacic() > 25){
//                index = i+1;
//                return true;
//            }
//        }

        while(index < zamownienies.length && zamownienies[index] != null && zamownienies[index].ilePlacic() <= 25){
            index++;
        }
        while (index < zamownienies.length && zamownienies[index] == null){
            index++;
        }

        if(index < zamownienies.length &&  zamownienies[index] != null && zamownienies[index].ilePlacic() > 25){
            return true;
        }
        return false;
    }

    @Override
    public Zamownienie next() {
        Zamownienie z = zamownienies[index];
        index += 1;
        return z;
    }
}
