package ua.nure.ostpc.kovaljov;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Eugne on 28.10.2016.
 */
public class Task15 {
    public static void main(String[] args) {
        String first = "Lorem ipsum dolor sit met";
        String second = "dolor met ipsum ipsum iiiiiiiiiii si sit ";
        Map<String, Integer> map = Arrays.stream(first.split("\\s"))
                .collect(Collectors.toMap(i -> i, i -> Collections.frequency(Arrays.asList(second.split("\\s")), i)));
        map.forEach((s, integer) -> {
            System.out.printf("Word '%s' -> %d " + System.lineSeparator(), s, integer);
        });
    }
}
