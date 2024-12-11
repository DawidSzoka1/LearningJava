package University.lab08.ex02;

public class KlasaN<T extends Number> {
    T[] arr;

    public KlasaN(){
        try {
            arr = (T[]) new Object[5];
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public KlasaN(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public Double avg(){
        double sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                sum += arr[i].doubleValue();
                count++;
            }
        }
        if(count > 0)
            return sum/count;
        else
            return 0.0;
    }

    public boolean porownaj(KlasaN<T> n){
        return n.avg().equals(this.avg());
    }
}
