package ua.nure.ostpc.kovaljov;

import java.util.Arrays;

/**
 * Created by Eugne on 28.10.2016.
 */
public class EightTask {
    private static final int N = 10;

    public static void main(String[] args) {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = i * i;
        }
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
