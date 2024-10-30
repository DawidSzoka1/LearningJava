package University.lab04;

public class Exercise03 {
    public static int TallestBuilding(Building[] b){
        Building l = b[0];
        for(int i = 1; i < b.length; i++){
            if(b[i].getFloorAmount() > l.getFloorAmount()){
                l = b[i];
            }
        }
        return l.getCounstructYear();
    }

    public static void main(String[] args) {
        Building[] buildings = new Building[9];
        for(int i = 0; i <= buildings.length-3; i+=3){
            buildings[i] = new Block(1900 + i, "main street", 20+i);
            buildings[i+1] = new Skyscraper(2003 + i, "main street", 40+i);
            buildings[i+2] = new House(2000 + i, "main street", 2+i);
        }
        for(Building building : buildings){
            building.info();
        }

    }
}
