public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Task1");
        for (int i = 0; i < 3000; i++) {
            printYearIsLeap(i);
        }
    }

    public static void printYearIsLeap(int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        String message = "год не является високосным";
        if (isLeapYear) {
            message = "год является вискосным";
        }
        System.out.printf("%d %s\n", year, message);
    }

}