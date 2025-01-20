package University.kol2v2.zad3;

import java.util.Iterator;

public class SlownikIterator implements Iterator<Slowo> {
    int index;
    int kierunek;
    Slowo[] slowa;
    public SlownikIterator(Slowo[] slowa){
        this.slowa = slowa;
        if(slowa.length % 2 == 0){
            index = slowa.length - 1;
            kierunek = -1;
        }else{
            index = 0;
            kierunek = 1;
        }
    }
    @Override
    public boolean hasNext() {
        if(kierunek == -1){
            while (index >= 0 && slowa[index] == null){
                index -= 2;
            }
            return index >= 0 && slowa[index] != null;
        }
        while (index < slowa.length && slowa[index] == null){
            index += 2;
        }
        return index < slowa.length && slowa[index] != null;
    }

    @Override
    public Slowo next() {
        Slowo s = slowa[index];
        index += kierunek * 2;
        return s;
    }
}
