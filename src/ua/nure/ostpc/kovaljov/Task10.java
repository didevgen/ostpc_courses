package ua.nure.ostpc.kovaljov;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Eugne on 28.10.2016.
 */
public class Task10 {
    public static final Integer[] ARRAY = new Integer[]{1, 2, 2, 2, 5, 6, 7, 12, 3, 55, 21, 355, 21, 42, 5, 56, 7, 52, 5};

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(ARRAY);
        lst.stream().filter(item ->
                Collections.frequency(lst, item) > 2)
                .collect(Collectors.toSet())
                .forEach(i -> System.out.println(i + " "));
    }
}
