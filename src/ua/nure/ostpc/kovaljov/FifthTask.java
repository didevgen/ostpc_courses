package ua.nure.ostpc.kovaljov;

import java.util.*;

public class FifthTask {
    private static int start = 1_000;
    private static int finish = 10_000;

    private static boolean hasDuplicates(String input) {
        Set<Integer> splittedInput = new HashSet<>();
        for (int element : input.toCharArray()) {
            splittedInput.add(element);
        }
        return splittedInput.size() == 4 ? false : true;
    }

    private static void printCollection(List<Integer> list) {
        for (Integer elem : list) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> resultNumbers = new ArrayList<>();
        for (; start < finish; ) {
            if (!hasDuplicates(String.valueOf(start++))) {
                resultNumbers.add(start);
            }
        }
        printCollection(resultNumbers);
    }
}
