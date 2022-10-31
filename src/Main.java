public class Main {
    public static void main(String[] args) {
        int clientOS = 1;

        System.out.println("Задание 1");

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("Задание 2");

        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке!");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке!");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке!");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("Задание 3");

        int year = 2020;

        if (year / 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println();
        System.out.println("Задание 4");

        int deliveryDistance = 101;
        int days;

        if (deliveryDistance < 20) {
            days = +1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days = +2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days = +3;
        } else {
            days = 0;
        }

        if (days != 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Время доставки составит более 3 дней.");
        }

        System.out.println();
        System.out.println("Задание 5");

        int month = 40;

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Это зимний месяц.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц.");
                break;
            default:
                System.out.println("Такого месяц не бывает.");
        }


    }
}