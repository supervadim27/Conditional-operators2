import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println();
        System.out.println("Задание №1");
        int clientOS = 0;
        if (clientOS > 1 || clientOS < 0) {
            System.out.println("Выбери 0 или 1");
        }
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задание №2");
        int clientDeviceYear = 2013;
        int clientOS = 1;
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задание №3");
        int year = 2024;
        boolean leapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                }
            } else {
                leapYear = true;
            }
        }
        if (year < 1584) {
            System.out.println("Введите значение больше 1584");
        } else if (leapYear) {
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+" год не является високосным");
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задание №4");
        int deliveryDistance = 95;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System.out.println("дней доставки: 1 день");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("дней доставки: 2 дня");
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("дней доставки: 3 дня");
        }
        if (deliveryDistance >= 100) {
            System.out.println("свыше 100 км доставки нет");
        }
    }

    public static void task5() {
        System.out.println();
        System.out.println("Задание №5");
        int mounthNumber = 6;
        if (mounthNumber < 1 || mounthNumber > 12) {
            System.out.println("Введите корректный месяц");
        }
        switch (mounthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц №"+mounthNumber+" принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц №"+mounthNumber+" принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц №"+mounthNumber+" принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц №"+mounthNumber+" принадлежит к сезону осень");
                break;
        }

    }
}




