package University.kol01;

abstract class Skladnki{
    String name;
    int ilosc;

    public Skladnki(String name, int ilosc) {
        this.name = name;
        this.ilosc = ilosc;
    }
    public String Cok() {
        return name;
    }
    abstract String przedGotowaniem();
    @Override
    public String toString() {
        return "Skladnki{" +
                "name='" + name + '\'' +
                ", ilosc=" + ilosc +
                '}';
    }
}
class Warzywo extends Skladnki{

    public Warzywo(String name, int ilosc) {
        super(name, ilosc);
    }

    @Override
    String przedGotowaniem() {
        return "umyc i obrac";
    }
}

class Przypraw extends Skladnki{
    public Przypraw(String name, int ilosc) {
        super(name, ilosc);
    }

    @Override
    String przedGotowaniem() {
        return "odmierzyc";
    }
}

class Mieso extends Skladnki{
    public Mieso(String name, int ilosc) {
        super(name, ilosc);
    }

    @Override
    String przedGotowaniem() {
        return "pokroic w kostke";
    }

}

class Przepis{
    Skladnki[] skladnki;
    String przedGotowaniem(){
        String s = "";
        for(Skladnki skladnki : skladnki){
            s += skladnki.toString();
            System.out.println(skladnki.przedGotowaniem());
        }

        return s;
    }

}

public class ex06 {
}
