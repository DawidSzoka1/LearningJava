package University.kombajn.zad4;

import java.util.ArrayList;
import java.util.List;

public class Apteka {
    List<Lek> leki;

    public Apteka(){
        leki = new ArrayList<>();
    }
    public Apteka(List<Lek> leki) {
        this.leki = leki;
    }

    public List<Lek> getLeki() {
        return leki;
    }

    public void setLeki(List<Lek> leki) {
        this.leki = leki;
    }
}
