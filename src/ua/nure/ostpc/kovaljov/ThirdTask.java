package ua.nure.ostpc.kovaljov;

public class ThirdTask {

    public static final int DAYS_PER_WEEK = 7;
    public static final int DAYS_PER_MONTH = 30;
    public static final int MONTH_PER_YEAR = 12;

    public static void main(String[] args) {
        System.out.println("Enter the amount of weeks");
        int weeks = Main.SCANNER.nextInt();
        System.out.println("Enter the amount of month");
        int month = Main.SCANNER.nextInt();
        System.out.println("Enter the amount of years");
        int years = Main.SCANNER.nextInt();
        int result = years * MONTH_PER_YEAR * DAYS_PER_MONTH +
                month * DAYS_PER_MONTH + weeks * DAYS_PER_WEEK;
        System.out.printf("The amount of days is %d", result);
    }
}
