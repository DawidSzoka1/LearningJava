package University.lab04;

public class Block extends Building{

    public Block(){
        super();
    }
    public Block(int counstructYear, String mainStreet, int floorAmount) {
        super("Block", counstructYear, mainStreet, floorAmount);
    }

    @Override
    void transport() {
        System.out.println("idz schodami lub jedz winda");
    }
}
