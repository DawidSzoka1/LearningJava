package University.kol2v2.zad4;

import java.util.Comparator;

public class PrownajLeki implements Comparator<Lek> {

    @Override
    public int compare(Lek o1, Lek o2) {
        int compareNazwa = o1.getNazwa().compareTo(o2.getNazwa());
        if(compareNazwa == 0){
            LekRef l1 = null;
            LekRef l2 = null;
            if(o1 instanceof LekRef){
                l1 = (LekRef)o1;
            }
            if(o2 instanceof LekRef){
                l2 = (LekRef)o2;
            }
            if(l1 == null && l2 == null){
                return 0;
            }else if(l1 == null || l2 == null) {
                return l1 == null ? 1 : -1;
            }
            return  l2.getZnizka() - l1.getZnizka() ;
        }
        return -compareNazwa;
    }
}
