package University.lab09;

public class CustomException extends Exception {
    public CustomException() {
        super("Custom Exception test123");
    }
    public CustomException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "CustomException{}";
    }
}
