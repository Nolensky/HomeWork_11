public class Main {

    public static void checkIsLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year < 1584) {
            System.out.println("Вы ввели не корректный год");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printMessageToClient(int clientDeviceYear, int clientOS) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Вы ввели неверные двнные");
        }
    }

    public static int calculateTimeDelivery(int range) {
        int timeOfDelivery = 1;
        if (range >= 20 && range <= 60) {
            return timeOfDelivery * 2;
        } else if (range > 60 && range <= 100) {
            return timeOfDelivery * 3;
        } else {
            return timeOfDelivery;
        }
    }

    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
    }

    public static void task_1() {
        System.out.println("Задача 1");
        int year = 2025;
        checkIsLeapYear(year);
        System.out.println();
    }

    public static void task_2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int osDevice = 0;
        printMessageToClient(clientDeviceYear, osDevice);
        System.out.println();
    }

    public static void task_3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        if (deliveryDistance <= 0 || deliveryDistance > 100) {
            System.out.println("Доставки нет!");
            return;
        }
        System.out.println("Потребуется дней: " + calculateTimeDelivery(deliveryDistance));
    }
}