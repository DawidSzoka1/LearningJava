package operators;

public class bit {
    public static void main(String[] args){
        /*
        & - iloczyn bitowy
        | - suma bitowa
        ^ - xor
        x << 1 - przesuniecie w lewo o 1
        x >> 2 - przesuniecie w prawo o 2
        ~ negacja bitowa
         */
        int a = 6, b = 5;
        System.out.println(a << 2);// 000110 << 2 = 011000
        System.out.println(a | b);// 101 | 110 = 111
        System.out.println(a & b);// 101 & 110 = 100
        System.out.println(a ^ b);// 1 1 -0     1 0 - 1     0 1- 1      0 0 - 0
    }
}
