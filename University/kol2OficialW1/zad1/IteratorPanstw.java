package University.kol2OficialW1.zad1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPanstw implements Iterator<Panstwo> {
    int index = 0;
    List<Panstwo> panstwa;

    public IteratorPanstw(List<Panstwo> panstwa) {
        this.panstwa = panstwa;
    }

    @Override
    public boolean hasNext() {
        while(index < panstwa.size() && panstwa.get(index).getNazwa().charAt(0) != 'P'){
            index++;
        }
        if(index < panstwa.size() && panstwa.get(index).getNazwa().charAt(0) == 'P'){
            return true;
        }
        return false;
    }

    @Override
    public Panstwo next() {
        Panstwo p = panstwa.get(index);
        index++;
        return p;
    }
}
