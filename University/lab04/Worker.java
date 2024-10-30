package University.lab04;

import University.lab03.Uczen;

public class Worker extends Uczen {
    private double pensja;

    public Worker() {
        super();
    }

    public Worker(String first_name, String last_name, String pesel_number, double pensja) {
        super(first_name, last_name, pesel_number);
        this.pensja = pensja;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if(o == this) {
            return true;
        }
        if(!(o instanceof Worker)){
            return false;
        }
        Worker p = (Worker)o;
        return p.getPesel_number().equals(this.getPesel_number());
    }
}
