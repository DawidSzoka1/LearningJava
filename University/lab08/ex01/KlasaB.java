package University.lab08.ex01;

public class KlasaB<T>{
    private T[] array;

    public KlasaB(T[] array){
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
    public boolean isAIn(KlasaA<T> klasaA){
        if(klasaA == null){
            return false;
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] != null && array[i].equals(klasaA.getVariable())){
                return true;
            }
        }
        return false;
    }
}
