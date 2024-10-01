package UdemyYT.Variables.objectPrograming;

public class Bottle {
    private double capacity;
    Bottle(){}
    Bottle(double capacity){
        this.capacity = capacity;
    }
    double getCapacity(){
        return capacity;
    }
    void setCapacity(double capacity){
        this.capacity = capacity;
    }
    void fromOneToAnother( Bottle b2, double amount){
        this.setCapacity(this.getCapacity() - amount);
        b2.setCapacity(b2.getCapacity() + amount);
        System.out.println("From One to Another : " + this.getCapacity() + " Another: " + b2.getCapacity());
    }

    public static void main(String[] args){
        Bottle[] bottles = new Bottle[10];
        int i;
        for(i = 0; i < bottles.length; i++){
            bottles[i] = new Bottle(10 - i);
        }
        System.out.println(i);
        System.out.println(bottles[0].getCapacity());
        bottles[0].fromOneToAnother(bottles[1], 4);
        System.out.println(bottles[0].getCapacity());
    }
}
