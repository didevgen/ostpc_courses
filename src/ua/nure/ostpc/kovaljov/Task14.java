package ua.nure.ostpc.kovaljov;

/**
 * Created by Eugne on 28.10.2016.
 */
public class Task14 {
    public static void main(String[] args) {
        String string = "            ddd            ddddddddddd        qwwqwq      ";
        System.out.println(string.replaceAll("[\\s]{2,}"," "));
    }
}
