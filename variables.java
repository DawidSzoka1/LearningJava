public class variables {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        long lon = 4324L;
        long d;
        d = 432423L;
        byte by = 34;
        int c = a + b;
        String s = "asdsfd";

        if (a > b & a > 2 || a < b) {
            System.out.println(a);
        }
        /*
            Type of variables:

            Numeric:
                byte - 8 bit - from -128 to 127
                short - 16 bit - from -2 ^ 15 to 2 ^ 15 - 1
                int - 32 bit - from -2 ^ 31 to 2 ^ 31 - 1
                long - 64 bit - from -2^63 to 2 ^ 63 - 1 (L in the end)

            Characters:
                char - one character 'c'
                String
            Decimal number:
                float - 32 bit (f in the end)
                double - 64 bit

         */
        float f = 32.2f;
        double dou = 432.43242;
        char one = 's';
        System.out.println(one  + " s" + a);
        // println add '/n' in the end of string
        System.out.print("Hello");
        System.out.print(" Word");
    }
}