package University.lab07.ex01;

public abstract class Zwierze {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zwierze() {
        this.name = "bez nazwy";
    }
    public Zwierze(String name) {
        this.name = name;
    }
    public abstract String getTyp();
}
