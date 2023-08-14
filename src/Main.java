import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void checkValue(int yearChecking) {
        if (yearChecking % 4 == 0 && yearChecking % 100 != 0 || yearChecking % 400 == 0) {
            System.out.println(yearChecking + " год является високосным");
        } else {
            System.out.println(yearChecking + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год для проверки: ");
        checkValue(scanner.nextInt());
    }

    public static void installingASupportedVersion(int userOS, int yearIssuePhone) {
        if (userOS == 1 && yearIssuePhone >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (userOS == 1) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");

        } else if (userOS == 0 && yearIssuePhone >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая у вас операционная система, введите '0' если Android - '1' если IOS : ");
        int clientOS = Integer.parseInt(scanner.next());
        if (clientOS < 0 || clientOS > 1) {
            throw new RuntimeException("Недопустимое значение !");
        }
        System.out.println("Год выпуска вашего мобильного телефона: ");
        int clientDeviceYear = Integer.parseInt(scanner.next());

        installingASupportedVersion(clientOS, clientDeviceYear);

    }


    public static int needDaysForDelivery(int distanceForDelivery) {
        if (distanceForDelivery <= 20) {
            return 1;
        } else if (distanceForDelivery <= 60) {
            return 2;
        } else if (distanceForDelivery <= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние: ");
        int deliveryDistance = Integer.parseInt(scanner.next());
        int days = needDaysForDelivery(deliveryDistance);
        if (deliveryDistance > 100) {
            System.out.println("Вы находитесь в не зоны доставки! ");
        } else if (days < 1) {
            System.out.println("Некорректное значение!");
        } else {
            System.out.println("Ожидайте доставки карты на " + days + " сутки!");
        }



    }
}