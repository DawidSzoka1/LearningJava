package University.kombajn.zad2;

import java.util.TreeSet;

public class Kraj {
    TreeSet<Miasto> miasta;

    public Kraj(){
        miasta = new TreeSet<>();
    }
    public Kraj(TreeSet<Miasto> miasta) {
        this.miasta = miasta;
    }

    public TreeSet<Miasto> getMiasta() {
        return miasta;
    }

    public void setMiasta(TreeSet<Miasto> miasta) {
        this.miasta = miasta;
    }
}
