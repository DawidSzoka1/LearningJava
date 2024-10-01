package UdemyYT.Variables.objectPrograming;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class InterfacesTest {
    public static void main(String[] args) {
        System.out.println(Name.PI);
        Name a = new NameImplements();
//        Name b = new Name();  don't work
        int[] tab = {2, 4, 1};
        NameImplements[] b = new NameImplements[4];
        b[0] = new NameImplements(3);
        b[1] = new NameImplements(5);
        b[2] = new NameImplements(6);
        b[3] = new NameImplements(2);
        Arrays.sort(tab);
        System.out.println(NameImplements.PI);
        System.out.println(Arrays.toString(tab));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        

    }
}

interface  Name{// can't by public
    double PI = 3.14;// public static and final
    void display();// public abstract

}
interface Surname{

}

class NameImplements implements Name, Surname, Comparable { // In java you can implements more than one interface
    NameImplements(){}
    int x;
    NameImplements(int x){
        this.x = x;
    }
    @Override
    public void display() {
        System.out.println("Person");
    }

    @Override
    public int compareTo(@NotNull Object o) {
        if(this.x > ((NameImplements)o).x){
            return 1;
        }else if(this.x < ((NameImplements)o).x){
            return -1;
        }
        return 0;
    }
    public String toString(){
        return "Person " + this.x;
    }
}
/*
can't multiple inheritance
class S extends t, m{

}

 */