package ua.nure.ostpc.kovaljov;

/**
 * Created by Eugne on 28.10.2016.
 */
public class Task12 {
    public static void main(String[] args) {
        String input = "MOTHER WASHED RAMA";
        if (input.toLowerCase().startsWith("abc")) {
            input = input.replaceAll("abc","");
        } else {
            input = input + "zzz";
        }
        System.out.println(input);
    }
}
