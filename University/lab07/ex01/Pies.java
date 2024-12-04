package University.lab07.ex01;

public class Pies extends Zwierze implements Speakable, Moveable{
    public Pies() {
    }

    public Pies(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Pies o nazwie " + super.getName() + " ruszyl");
    }

    @Override
    public void stop() {
        System.out.println("zatrzymal sie " + super.getName());
    }

    @Override
    public String getVoice(int voice) {
        return voice == 1 ? "LOUD" : " QUIET";
    }

    @Override
    public String getTyp() {
        return "Pies";
    }
}
