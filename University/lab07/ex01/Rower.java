package University.lab07.ex01;

public class Rower implements Moveable{
    @Override
    public void start() {
        System.out.println("Rusza rower");
    }

    @Override
    public void stop() {
        System.out.println("Rower zatrzymal sie");
    }
}
