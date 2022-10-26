public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            int x = Integer.parseInt(arg);
            if (x > 0) {
                count++;
            }
        }
        System.out.println("количество положительных чисел = " + count);
    }
}

