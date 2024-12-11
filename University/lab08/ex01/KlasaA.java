package University.lab08.ex01;

public class KlasaA<T> {
    private T variable;
    public KlasaA(T variable) {
        this.variable = variable;
    }
    public KlasaA(){}
    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }
}
