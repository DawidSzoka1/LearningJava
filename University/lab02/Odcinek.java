package University.lab02;

public class Odcinek {
    Point x;
    Point y;

    public Odcinek(){}
    public Odcinek(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x.toString() + "->" + y.toString();
    }

    double lenght(){
        double a = Math.pow(x.getX() - y.getX(), 2);
        double b = Math.pow(x.getY() - y.getY(), 2);

        return Math.sqrt(a + b);
    }

    public static Odcinek[] maxLenght(Odcinek[] odcineks){
        double max = odcineks[0].lenght();
        int count = 1;
        double check;
        for(int i = 1; i < odcineks.length; i++){
            check = odcineks[i].lenght();
            System.out.println("dlugosc " + check + " aktualny max " + max);
            if(check > max){

                max = check;
                count = 1;
            }else if(check == max){
                count++;
            }
        }
        int j = 0;
        Odcinek[] longest = new Odcinek[count];
        for(int i = 0; i < odcineks.length; i++){
            if(odcineks[i].lenght() == max){
                longest[j] = odcineks[i];
                j ++;
            }
        }
        return longest;
    };

}
