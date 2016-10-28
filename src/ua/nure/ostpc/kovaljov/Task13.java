package ua.nure.ostpc.kovaljov;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Eugne on 28.10.2016.
 */
public class Task13 {
    private static final String INPUT = "my 17th we're very fun2y 28121";
    private static final String REGEX = "(\\w*\\d[\\w\\d]+)";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        int result = 0;
        while (matcher.find()) {
            String current = matcher.group();
            for (int item : current.toCharArray()) {

                int curr = item - 48;
                if (0 <= curr && curr < 10) {
                    result += curr;
                }
            }
        }
        System.out.println(result);
    }
}
