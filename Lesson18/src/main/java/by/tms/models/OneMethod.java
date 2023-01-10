package by.tms.models;

import java.util.Scanner;

public class OneMethod {
    private Scanner console = new Scanner(System.in);

    void chooseNumberForOperation() {
        int number = 0;
        if (console.nextInt() == 1) {
            number = 1;
        } else if (console.nextInt() == 2) {
            number = 2;
        }
        switch (number) {
            case 1 -> reversedString();
            case 2 -> factorial();
            default -> System.out.println("Other Method");
        }
    }

    public String reversedString() {
        return "text";
    }

    public int factorial() {
        return 0;
    }

    @FunctionalInterface
    public interface OperationAware<T> {
        T operation(T t);
    }
}
