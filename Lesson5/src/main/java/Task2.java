//2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа
public class Task2 {
    public static void main(String[] args) {
        int numberOfAmoebas;
        for (int i = 1; i <= 8; i++) {
            numberOfAmoebas = (int) Math.pow(2, i);
            System.out.println(numberOfAmoebas);
        }
    }
}
