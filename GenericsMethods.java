public class GenericsMethods {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 2.6, 3.65, 4.8, 5.};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        String[] stringArray = {"Ab", "aB", "Cc", "Dd", "Egfd"};
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);
        System.out.println(getFirst(intArray));

    }
    public static <Thing> void displayArray(Thing[] array) {//only reference data type
        for(Thing i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static <Thing> Thing getFirst(Thing[] array) {
        return array[0];
    }
}
