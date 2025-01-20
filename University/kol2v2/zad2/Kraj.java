package University.kol2v2.zad2;

import java.util.TreeSet;

public class Kraj {
    private TreeSet<Miasto> miasta;

    public Kraj(){
        miasta = new TreeSet<>();
    }
    public Kraj(TreeSet<Miasto> miasta) {
        this.miasta = miasta;
    }

    public void addMiasto(Miasto m){
        miasta.add(m);
    }

    public TreeSet<Miasto> getMiasta() {
        return miasta;
    }

    public void setMiasta(TreeSet<Miasto> miasta) {
        this.miasta = miasta;
    }

    @Override
    public String toString() {
        return "Kraj{" +
                "miasta=" + miasta +
                '}';
    }
}
