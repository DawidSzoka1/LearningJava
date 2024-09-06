public class Printf {
    public static void main(String[] args) {
        System.out.printf("this is a format string %f %c\n", 123.2, 'c');
        boolean b = true;
        System.out.printf("%b \n", b);
        String s = "string";
        System.out.printf("%s", s);
        System.out.printf("hello %10s\n", s);//10 characters with s
        System.out.printf("hello %.2f\n", 12.332);
        System.out.printf("%,f", 3232.23323);


    }
}
