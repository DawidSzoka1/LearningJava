package objectPrograming;


import java.util.Arrays;

public class base {
    public static void main(String[] args){
        Monitor abc = new Monitor();
        Monitor abc2 = new Monitor();
        abc.height = 100;
        abc2.height = 200;
        System.out.println(abc.height);
        System.out.println(abc2.height);
        abc.on();
        Monitor abc3 = new Monitor(123, 31);
        Monitor[] monitors = new Monitor[4];
        for(Monitor m: monitors){
            m = new Monitor(2, 3);
            System.out.println(m.height);
        }
    }
}

class Monitor{
    int width;
    int height;
    boolean power;
    void on(){
        System.out.println("on " + height + width);
        power = true;
    }
    void off(){
        System.out.println("off " + height + width);
        power = false;
    }
    Monitor(int width, int height){
        this.width = width;
        this.height = height;
        System.out.println("New monitor created");
    }
    Monitor(){}
    Monitor(float width, float height){
        this.width = (int) width;
        this.height = (int) height;

    }
    int add(){
        return width + height;
    }
}
