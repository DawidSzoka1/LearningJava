package UdemyYT.Variables.ProjectDocumentation;

/**
 * @author Dawid
 * @version 0.0.1 04.09.2024
 * @see <a href="link" target="_blank">go to some link</a>
 * @see UdemyYT.Variables.objectPrograming.base#main(String[])
 * @see Documentation#getNumber()
 * @deprecated dont use will be new version
 */
public class Documentation {
    int number;
    String name;
    double number2;
    /**
     * Default constructor
     */
    Documentation(){}

    /**
     *
     * @param number set number to number
     * @param name to set name
     */
    Documentation(int number, String name){
        this.number = number;
        this.name = name;
    }

    /**
     *
     * @param number to set number
     * @param name to set name
     * @param number2 to set number2
     */
    Documentation(int number, String name, double number2){
        this(number, name);
        this.number2 = number2;
    }

    /**
     *
     * @param number set number to new value
     */
    void setNumber(int number){
        this.number = number;
    }

    /**
     *<pre>
     *     Documentation d = new Documentation();
     *     d.getNumber();
     *</pre>
     * @return number
     */
    int getNumber(){
        return number;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
    }
}

