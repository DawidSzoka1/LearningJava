package University.lab07.ex01;

public class Samochod implements Moveable{
    private String marka;

    @Override
    public void start() {
        System.out.println("Samchod marki " + marka + " rusza");
    }

    @Override
    public void stop() {
        System.out.println("Samchod marki " + marka + " zatrzymal sie");
    }

}
