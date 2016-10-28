package ua.nure.ostpc.kovaljov;
import java.util.Date;

public class SecondTask {

    public static void main(String[] args) {
        System.out.println("Please enter the sample string");
        String input = Main.SCANNER.nextLine();
//        input = input.replaceAll("[1234567890]",""); // for clear example
        input = input.replaceAll("\\d","");
        System.out.println(input);
        input = new Date(System.currentTimeMillis()).toString();
        input = input.replaceAll("[0-9]", ""); //Please Google Regular Expressions
        System.out.println(input);
    }
}
