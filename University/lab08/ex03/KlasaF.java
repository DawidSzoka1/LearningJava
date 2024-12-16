package University.lab08.ex03;

public class KlasaF<T extends Figura> {
    T variable;

    public KlasaF(T variable) {
        this.variable = variable;
    }

    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }
}
