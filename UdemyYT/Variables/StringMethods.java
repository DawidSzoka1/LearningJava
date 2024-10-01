package UdemyYT.Variables;

public class StringMethods {
    public static void main(String[] args) {
        String name = "name";
        System.out.println(name.equalsIgnoreCase("Name"));
        System.out.println(name.length());
        System.out.println(name.charAt(0));

        for(char c: name.toCharArray()){
            System.out.println(c);
        }
        for(int i = 0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}
