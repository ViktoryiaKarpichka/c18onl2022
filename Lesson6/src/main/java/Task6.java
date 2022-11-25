//6) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *
public class Task6 {
    public static void main(String[] args) {
        char[][] massive = new char[4][4];
        massiveOne(massive);
        massiveTwo(massive);
        massiveThree(massive);
        massiveFor(massive);
    }
    private static void massiveOne(char[][] massive) {
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                if (j >= massive.length - 1 - i) {
                    massive[i][j] = '*';
                    System.out.print(massive[i][j]);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void massiveTwo(char[][] massive) {
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                if (j <= i) {
                    massive[i][j] = '*';
                    System.out.print(massive[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void massiveThree(char[][] massive) {
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                if (j <= massive.length - 1 - i) {
                    massive[i][j] = '*';
                    System.out.print(massive[i][j]);
                }
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    private static void massiveFor(char[][] massive) {
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                if (j >=i) {
                    massive[i][j] = '*';
                    System.out.print(massive[i][j]);
                } else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

}
