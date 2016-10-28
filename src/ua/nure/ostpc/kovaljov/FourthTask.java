package ua.nure.ostpc.kovaljov;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FourthTask {
    private static final String DATE_FORMAT = "dd MM yyyy";
    //visit: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

    /**
     * Read: http://www.quizful.net/post/java-exceptions
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Write your date");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(Main.SCANNER.nextLine());
            System.out.println("yes");
        } catch (ParseException e) {
            System.out.println("no");
        }
    }
}
