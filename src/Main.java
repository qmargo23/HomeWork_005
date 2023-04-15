public class Main {
    public static void main(String[] args) {
        task1();//Задача 1 (iOS или Android)
        task2();//Задача 2 (iOS или Android с дополнением по году)
        task3();//Задача 3 (високосный год)
        task4();//Задача 4 (доставка карт на дом)
        task5();//Задача 5 (месяц - сезон)
    }

    public static void task1 () {
        System.out.println("Задача 1 (iOS или Android)");
        // clientOS    iOS-0   Android-1
        int clientOS = 1;// задаем значение для андроида (1)
        if (clientOS ==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else System.out.println("Установите версию приложения для Android по ссылке");// выполняется эта строка
        System.out.println("_____________________________");
    }

    public static void task2 () {
        System.out.println("Задача 2 (iOS или Android с дополнением по году)");
        // clientOS    iOS-0   Android-1   clientDeviceYear
        int clientOS = 1;// задаем значение  (1)
        int clientDeviceYear = 2015;//задаем значение года 2015

        if ( clientOS == 0 ){
            if (clientDeviceYear< 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
            else System.out.println("Установите версию приложения для iOS по ссылке");
                        
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");// выполняется эта строка
        } else System.out.println("Установите версию приложения для Android по ссылке");
        System.out.println("_____________________________");
    }


    public static void task3 () {
        System.out.println("Задача 3 (високосный год)");
        // year
        int year = 2021;

        if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0 ){
            System.out.println(year+" год является високосным");
        }else
            System.out.println(year+" год не является високосным");

        System.out.println("_____________________________");
    }


    public static void task4 () {
        System.out.println("Задача 4 (доставка карт на дом)");
        //deliveryDistance = 95
        int deliveryDistance = 95 ;
        int day = 0 ;

        if (deliveryDistance < 20){
            day = 1;
            System.out.println("Потребуется дней: "+day);
        } else if (deliveryDistance < 60) {
            day = 2;
            System.out.println("Потребуется дней: "+day);
        } else if (deliveryDistance < 100) {
            day = 3;
            System.out.println("Потребуется дней: "+day);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        System.out.println("_____________________________");
    }

    public static void task5 () {
        System.out.println("Задача 5 (месяц - сезон)");
        // monthNumber = 12
        int monthNumber = 12;

        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println( monthNumber+ " - Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println( monthNumber+ " - Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println( monthNumber+ " - Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println( monthNumber+ " - Осень");
                break;
            default:
                System.out.println("Месяц должен быть от 1 до 12.");
        }
        System.out.println("_____________________________");
    }
}