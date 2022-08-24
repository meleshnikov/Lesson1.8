import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();

    }

    public static void task1() {
        System.out.println("Task1");
        for (int i = 0; i < 3000; i++) {
            printYearIsLeap(i);
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        printClientOs(0, 2001);
        printClientOs(0, 2024);
        printClientOs(1, 2005);
        printClientOs(1, 2034);
        printClientOs(5, 2022);
    }

    public static void task3() {
        System.out.println("Task 3");
        for (int i = 5; i < 1000; i += 5) {
            System.out.println(i + " км - потребуется дней " + getDeliveryDays(i));
        }
    }

    public static void task4() {
        searchDuplicatesSeqChars("abcdeffghvv");
        searchDuplicatesChars("ahjhjhfjgfa");
    }

    public static void printYearIsLeap(int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        String message = "год не является високосным";
        if (isLeapYear) {
            message = "год является вискосным";
        }
        System.out.printf("%d %s\n", year, message);
    }

    public static void printClientOs(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String liteVersion = (clientDeviceYear < currentYear) ? "облегченную " : "";
        String os = "";
        switch (clientOS) {
            case 0:
                os = "iOS";
                break;
            case 1:
                os = "Android";
                break;
            default:
                System.out.println("Такой версии ОС нет в базе");
                return;
        }
        System.out.printf("Установите %sверсию приложения для %s по ссылке\n", liteVersion, os);
    }

    public static int getDeliveryDays(int deliveryDistance) {
        return (int) Math.ceil((deliveryDistance - 20.0) / 40.0) + 1;
    }

    //Работает для отсортированной строки
    public static void searchDuplicatesSeqChars(String str) {
        StringBuilder s = new StringBuilder(str);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.printf("В строке: %s\n%c - повторяется\n", str, s.charAt(i));
                return;
            }
        }
        System.out.printf("В строке: %s\nнет дублей\n", str);
    }
    //должно работать для неотсортированной строки
    public static void searchDuplicatesChars(String str) {
        StringBuilder s = new StringBuilder(str);
        int[] charsCount = new int[128];
        for (int i = 0; i < s.length(); i++) {
            if (charsCount[s.charAt(i)] > 0) {
                System.out.printf("В строке: %s\n%c - повторяется\n", str, s.charAt(i));
                return;
            }
            charsCount[s.charAt(i)]++;
        }
        System.out.printf("В строке: %s\nнет дублей\n", str);
    }

}