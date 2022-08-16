public class Main {
    public static void main(String[] args) {

        // первое задание

        int clientOS = 0;

        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // второе задание

        int clientPhoneOS = 1;
        int clientDeviceYear = 1995;

        if (clientPhoneOS == 0){
            if (clientDeviceYear >= 2015){
                System.out.println("Установите мобильную версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        else if (clientDeviceYear >=2015){
            System.out.println("Установите мобильную версию приложения для ANDROID по ссылке");
        }else {
            System.out.println("Установите облегченную версию приложения для ANDROID по ссылке");

        }

        // третье задание

        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 ||year % 400 == 0){
            System.out.println("Год" + year + "является високосным");
        }else {
            System.out.println("Год " + year + " не является високосным");
        }



        // четвертое задание

        int deliveryDistance = 95;
        int deliveryDeys = 0;

        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + deliveryDeys);
        }else if (deliveryDistance >= 20 && deliveryDistance<60){
            deliveryDeys +=1;
            System.out.println("Потребуется " + deliveryDeys+ " день");
        }else if(deliveryDistance>=60 &&deliveryDistance <100){
            deliveryDeys +=2;
            System.out.println("Потребуется " + deliveryDeys+ " дня");
        }

        // пятое задание

        int monthNumber = 12;

        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Это месяц зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это месяц весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это месяц лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это месяц осени");
                break;
            default :
                System.out.println("Такого месяца не существует");
        }
    }
}