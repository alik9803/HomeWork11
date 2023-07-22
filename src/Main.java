import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        checkYear(year);
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2() {
        int currentYear = LocalDate.now().getYear();
        int clientDeviceYear = 2015;
        int clientOs = 1;
        installMobileApp(clientOs, clientDeviceYear, currentYear);
    }

    public static void installMobileApp(int clientOs, int clientDeviceYear, int currentYear) {
        if (clientDeviceYear < currentYear) {
            if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOs == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOs == 0) {
                System.out.println("Установите обычную версию приложения для iOS");
            } else if (clientOs == 1) {
                System.out.println("Установите обычную версию приложения для Android");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays == -1) {
            System.out.println("Доставка невозможна.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}