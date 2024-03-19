public class Main {
    public static void main(String[] args) {
        // Exercise 1 & 2
        var clientOS = 0;
        var yearMade = 2017;
        if (clientOS == 0) {
            if (yearMade >= 2015) {

                System.out.println("Установите версию приложения для iOS по ссылке");

            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (yearMade >= 2015) {

                System.out.println("Установите версию приложения для Android по ссылке");

            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        // Exercise 3
        var year = 2077;
        if (year % 4 != 0) {
             System.out.println("Год не високосный");
            } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Год високосный");
            }
        }
        // Exercise 4
        var deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не осуществляется");
        }
        // Exercise 5
        var monthNumber = 30;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
        }
    }
}