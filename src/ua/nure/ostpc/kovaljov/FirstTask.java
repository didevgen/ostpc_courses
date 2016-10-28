package ua.nure.ostpc.kovaljov;

import java.util.InputMismatchException;

public class FirstTask {
    public static final int SECOND_IN_MINUTE = 60;
    public static final int METERS_IN_KILOMETERS = 1000;

    public static void main(String[] args) {
        try {
            System.out.println("Enter the amount of minutes");
            int minutes = Main.SCANNER.nextInt();
            System.out.println("Enter the amount of kilometers");
            double kilometers = Double.parseDouble(Main.SCANNER.nextLine());
            double result = (kilometers * METERS_IN_KILOMETERS) / (minutes * SECOND_IN_MINUTE);
            System.out.printf("The speed is %.2f meters per second", result);
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
