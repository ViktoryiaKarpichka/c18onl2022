//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
// Овен (21 марта – 20 апреля)
//Телец (21 апреля – 21 мая) ...
//Близнецы (22 мая – 21 июня) ...
//Рак (22 июня – 22 июля) ...
//Лев (23 июля – 21 августа) ...
//Дева (22 августа – 23 сентября) ...
//Весы (24 сентября – 23 октября) ...
//Скорпион (24 октября – 23 ноября)
//Стрелец (23 ноября — 22 декабря)
//Козерог (23 декабря — 20 января)
//Водолей (21 января — 19 февраля)
//Рыбы (20 февраля — 20 марта
public class Task4 {
    private static boolean checkDay(int day, int from, int to) {
        return day >= from && day <= to;
    }

    public static void main(String[] args) {
        int month = 4;
        int day = 8;
        getZodiacName(month, day);


    }

    private static void getZodiacName(int month, int day) {
        if (month == 1 && checkDay(day, 21, 31) || month == 2 && checkDay(day, 1, 19)) {
            System.out.println("Водолей");
        } else if (month == 2 && checkDay(day, 20, 29) || month == 3 && checkDay(day, 1, 20)) {
            System.out.println("Рыбы");
        } else if (month == 3 && checkDay(day, 21, 31) || month == 4 && checkDay(day, 1, 20)) {
            System.out.println("Овен");
        } else if (month == 4 && checkDay(day, 21, 30) || month == 5 && checkDay(day, 1, 21)) {
            System.out.println("Телец");
        } else if (month == 5 && checkDay(day, 22, 30) || month == 6 && checkDay(day, 1, 21)) {
            System.out.println("Близнецы");
        } else if (month == 6 && checkDay(day, 22, 31) || month == 7 && checkDay(day, 1, 22)) {
            System.out.println("Рак");
        } else if (month == 7 && checkDay(day, 23, 31) || month == 8 && checkDay(day, 1, 21)) {
            System.out.println("Лев");
        } else if (month == 8 && checkDay(day, 22, 30) || month == 9 && checkDay(day, 1, 23)) {
            System.out.println("Дева");
        } else if (month == 9 && checkDay(day, 24, 30) || month == 10 && checkDay(day, 1, 23)) {
            System.out.println("Весы");
        } else if (month == 10 && checkDay(day, 24, 31) || month == 11 && checkDay(day, 1, 23)) {
            System.out.println("Скорпион");
        } else if (month == 11 && checkDay(day, 24, 30) || month == 12 && checkDay(day, 1, 22)) {
            System.out.println("Стрелец");
        } else if (month == 12 && checkDay(day, 23, 31) || month == 1 && checkDay(day, 1, 20)) {
            System.out.println("Козерог");
        }
    }
}
