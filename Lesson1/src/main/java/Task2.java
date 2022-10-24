public class Task2 {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "4";
        strings[1] = "-11";
        strings[2] = "50";
        int count = 0;
        for (String string : strings) {
            int x = Integer.parseInt(string);
            if (x > 0) {
                count++;

            }
        }
        System.out.println(count);
    }
}

