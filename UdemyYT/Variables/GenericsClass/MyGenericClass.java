package UdemyYT.Variables.GenericsClass;

public class MyGenericClass <Thing, Thing2 extends Number> {//Thing2 need to be form Number data type
    Thing x;
    Thing2 y;
    MyGenericClass(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }
    public Thing getValue() {
        return this.x;
    }
}
