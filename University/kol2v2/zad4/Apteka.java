package University.kol2v2.zad4;

import java.util.List;

public class Apteka{
    private List<Lek> leki;

    public Apteka(List<Lek> leki) {
        this.leki = leki;
    }

    public List<Lek> getLeki() {
        return leki;
    }

    public void setLeki(List<Lek> leki) {
        this.leki = leki;
    }

    @Override
    public String toString() {
        return "Apteka{" +
                "leki=" + leki +
                '}';
    }
}
