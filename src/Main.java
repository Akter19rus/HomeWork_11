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
        } else if (userOS == 1 && yearIssuePhone < 2015) {
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
        if (clientOS < 0 && clientOS > 1) {
            throw new RuntimeException("Недопустимое значение !");
        }
        System.out.println("Год выпуска вашего мобильного телефона: ");
        int clientDeviceYear = Integer.parseInt(scanner.next());

        installingASupportedVersion(clientOS, clientDeviceYear);

    }


    public static void needDaysForDelivery(int dayForDelivery) {
        boolean oneDayDistance = (dayForDelivery <= 20 && dayForDelivery > 0);
        boolean twoDayDistance = (dayForDelivery > 20 && dayForDelivery <= 60);
        boolean threeDayDistance = (dayForDelivery > 60 && dayForDelivery < 100);
        if (oneDayDistance) {
            System.out.println("Для расстояния " + dayForDelivery + "км потребуются сутки на доставку карты");
        } else if (twoDayDistance) {
            System.out.println("Для расстояния " + dayForDelivery + "км потребуется два дня на доставку карты");
        } else if (threeDayDistance) {
            System.out.println("Для расстояния " + dayForDelivery + "км потребуется 3 дня на доставку карты");
        } else {
            System.out.println("Свыше 100 км доставки нет!");
        }
        return;
    }

    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние: ");
        String deliveryDistance = scanner.next();
        needDaysForDelivery(Integer.parseInt(deliveryDistance));

    }
}