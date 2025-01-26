package University.kombajn.zad4;

public class Lek implements Comparable<Lek> {
    private String nazwa;

    public Lek(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Lek{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }

    @Override
    public int compareTo(Lek o) {
        int poNazwie = this.getNazwa().compareTo(o.getNazwa());
        if(poNazwie == 0){
            LekRef lk1 = null;
            LekRef lk2 = null;
            if(this instanceof  LekRef){
                lk1 = (LekRef) this;
            }
            if(o instanceof LekRef){
                lk2 = (LekRef) o;
            }
            if(lk1 != null && lk2 != null){
                return -(lk1.getZznizka() - lk2.getZznizka());
            }
            if(lk1 != null || lk2 != null){
                 return lk1 == null ? 1 : -1;//tu zmienic jak nie tak
            }
            return 0;
        }
        return poNazwie;
    }
}
