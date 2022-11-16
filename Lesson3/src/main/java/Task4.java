import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int sec = random.nextInt(28801);
        int hour = sec / 3600;
        if (hour < 1) {
            System.out.println("До конца рабочего осталось меньше часа");
        } else if (hour == 1) {
            System.out.println("До конца рабочего остался 1 час");
        } else if (hour > 1 && hour <= 4) {
            System.out.println("До конца рабочего осталось " + hour + " часa");
        } else {
            System.out.println("До конца рабочего осталось " + hour + " часов");
        }
    }
}
