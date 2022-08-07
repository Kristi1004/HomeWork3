public class Main {
    public static void main(String[] args) {

//Задача 1
        int clientOs = 1;
        if (clientOs >= 1){
            System.out.println("Установите версию для iOS по ссылке");
        }else{
            System.out.println("Установите версию для Android по ссылке");
        }

//Задача 2
    int clientAndroid = 0;
    int phoneAge = 2015;
    if (clientAndroid == 1 && phoneAge <= 2014){
        System.out.println("Установите облегченную версию для Андроид по ссылке");
    }else if (clientAndroid == 1 && phoneAge >= 2015){
        System.out.println("Установите версию для Андроид по ссылке");
    }else if (clientAndroid == 0 && phoneAge <= 2014){
        System.out.println("Установите облегченную версию для IOS по ссылке");
    }else{
        System.out.println("Установите версию для IOS по ссылке");
    }

    //Задача 3
    int year = 2021;
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        System.out.println("Год " + year + " является високосным");
    }else{
        System.out.println("Год " + year + " не является високосным");
    }

    //Задача 4
    int deliveryDistance = 95;
    if (deliveryDistance <= 20) {
        System.out.println("Доставка займет сутки ");
    }else if (deliveryDistance > 20 && deliveryDistance <= 60) {
        System.out.println("Доставка займет двое суток");
    }else if (deliveryDistance > 60 && deliveryDistance < 100) {
        System.out.println("Доставка займет трое суток");
    }


    //Задача 5
    int monthNumber = 14;
     String season;

     switch (monthNumber) {
         case 1:
             season = "Зима";
             break;
         case 2:
             season = "Зима";
             break;
         case 3:
             season = "Весна";
             break;
         case 4:
             season = "Весна";
             break;
         case 5:
             season = "Весна";
             break;
         case 6:
             season = "Лето";
             break;
         case 7:
             season = "Лето";
             break;
         case 8:
             season = "Лето";
             break;
         case 9:
             season = "Осень";
             break;
         case 10:
             season = "Осень";
             break;
         case 11:
             season = "Осень";
             break;
         case 12:
             season = "Зима";
             break;
         default:
             season = "Не знаю такого";
             break;
     }
         System.out.println(season);


     }

    }




























