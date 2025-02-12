package University.korki2;

public class Element implements  Comparable<Element>{
    private String nazwa;
    int value;

    public Element(String nazwa) {
        this.nazwa = nazwa;
    }
    void metoda(){
        throw new Aut("dfds");
    }
    @Override
    public String toString() {
        return "Element{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }

    @Override
    public int compareTo(Element o) {
        return -(this.value - o.value);
    }
}
