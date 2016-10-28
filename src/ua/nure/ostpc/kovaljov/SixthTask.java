package ua.nure.ostpc.kovaljov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eugne on 28.10.2016.
 */
public class SixthTask {
    private static int start = 1_000;
    private static int finish = 10_000;

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        for (; start < finish; ) {
            int current = start++;
            if (String.valueOf(current).contains("3")) {
                result.add(current);
            }
        }
        FifthTask.printCollection(result);
    }
}
