public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ \"Условный оператор 2\" \n");

        //Задача 1
        byte clientOS = 1;//0 — iOS, 1 — Android
        System.out.println("Задача 1");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else  if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else {
            System.out.println("Нет приложения для Symbyan\n");
        }

        //Задача 2
        byte clientOS2 = 0; //0 — iOS, 1 — Android
        int clientDeviceYear = 2015;
        System.out.println("Задача 2");
        if (clientOS2 == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке\n");
            }
        } else if (clientOS2 == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке\n");
            }
        } else {
               System.out.println("Нет приложения для Symbyan\n");
        }

        //Задача 3
        int year = 2023;
        System.out.println("Задача 3");
        if (year < 1584) {
            System.out.println("До 1584 года високосность годов не определяли\n");
        } else if ((year % 400) == 0) {
            System.out.println("Год " + year + " високосный\n");
        } else if ((year % 100) == 0) {
            System.out.println("Год " + year + " невисокосный\n");
        } else if ((year % 4) == 0) {
            System.out.println("Год " + year + " високосный\n");
        } else {
            System.out.println("Год " + year + " невисокосный\n");
        }

        //Задача 4
        int deliveryDistance = 60;
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
        } else if (deliveryDistance < 60) {
            deliveryTime = 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
        }
        System.out.println("Задача 4");
        if (deliveryTime == 0) {
            System.out.println("Доставка не осуществляется\n");
        } else {
            System.out.println("Потребуется дней " + deliveryTime + "\n");
        }

        //Задача 5
        int monthNumber = 12;
        System.out.println("Задача 5");
        if (monthNumber > 12) {
            System.out.println("В году 12 месяцев, укажите корректный номер месяца\n");
        }
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("На дворе зима\n");
                break;
            case 3, 4, 5:
                System.out.println("На дворе весна\n");
                break;
            case 6, 7, 8:
                System.out.println("На дворе лето\n");
                break;
            case 9, 10, 11:
                System.out.println("На дворе осень\n");
                break;
        }
    }
}