package ua.nure.ostpc.kovaljov;

public class Task9 {

    public static final Integer[] ARRAY = new Integer[]{1, 2, 3, 4, 5, 6, 7, 12, 3, 55, 21, 355, 21, 42, 21455, 56, 7, 52, 3};

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < ARRAY.length - 1; i++) {
            try {
                if (ARRAY[i - 1] / ARRAY[i + 1] > 2 || ARRAY[i + 1] / ARRAY[i - 1] > 2) {
                    counter++;
                }
            } catch (ArithmeticException ex) {
                continue;
            }
        }
        System.out.println(counter);
    }
}
