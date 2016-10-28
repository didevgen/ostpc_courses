package ua.nure.ostpc.kovaljov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Eugne on 28.10.2016.
 */
public class Task11 {
    public static final Integer[] ARRAY = new Integer[]{1, 2, 2, 2, 5, 6, -7, 12, 3, -55, 21, 355, -21, 42, 5, 56, 7, 52, 5};

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        Arrays.stream(ARRAY).forEach(item -> {
            if (item > 0) {
                result.add(item);
            } else {
                result.add(item);
                result.add(0);
            }
        });
        Integer[] res = result.stream().toArray(size -> new Integer[size]);
        //print code here
    }
}
