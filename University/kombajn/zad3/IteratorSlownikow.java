package University.kombajn.zad3;

import java.util.Iterator;

public class IteratorSlownikow implements Iterator<Slowo> {
    int index = 0;
    int direction = 1;
    Slowo[] s;
    public IteratorSlownikow(Slowo[] s){
        this.s = s;
        if(this.s.length % 2 == 0){
            index = this.s.length - 1;
            direction = -1;
        }
    }

    @Override
    public boolean hasNext() {
        if(direction == -1){
//            while(index >= 0 && s[index] == null){
//                index -= 2;
//            }
//            if(index >= 0 && s[index] != null){
//                return true;
//            }
//            return false;
            if(index >= 0){
                return true;
            }
            return false;
        }
        if(index < s.length){
            return true;
        }
        return false;
    }

    @Override
    public Slowo next() {
        Slowo slowo = s[index];
        index += direction * 2;
        return slowo;
    }
}
