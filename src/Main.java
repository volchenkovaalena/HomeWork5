public class Main {
    public static void main (String[] args) {
        System.out.println ("Hello world!");

        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println ("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println ("Установите версию приложения для Android по ссылке");
        }


        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println ("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println ("Установите облегченную версию приложения для Android по ссылке");
        }

        int year = 2100;
        if (year >= 1584 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println ("год является високосным ");
        } else {
            System.out.println (" год НЕ является високосным ");
        }


        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {System.out.println ("Потребуется дней " + deliveryTime);}
        if (deliveryDistance >= 20 && deliveryDistance < 60 ) {
            deliveryTime = deliveryTime + 1;
            System.out.println ("Потребуется дней " +deliveryTime);}
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println ("Потребуется дней " + deliveryTime);}
        if (deliveryDistance > 100 ) {
            System.out.println (" Доставка в ваш район не осущствляется");
        }

        int monthOfYear = 3;

        switch (monthOfYear) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не сущестует");
        }


    }
}


