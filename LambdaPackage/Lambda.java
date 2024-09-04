package LambdaPackage;

public class Lambda {
    public static void main(String[] args) {
        AfterClick a = (int c, int b) -> System.out.println("Lambda after click" + c + b);

        Button b = new Button();
        b.click(5, 3, a);
    }
}

interface AfterClick{
    void click(int a, int b);

}

class Button{
    void click(int a, int b, AfterClick afterClick) {
        afterClick.click(a, b);
    }

}