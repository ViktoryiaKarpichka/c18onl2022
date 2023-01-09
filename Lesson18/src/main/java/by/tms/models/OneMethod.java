package by.tms.models;

import java.util.Scanner;

public class OneMethod {
    private Scanner console = new Scanner(System.in);


    @FunctionalInterface
    public interface OperationAware<T> {
        T operation(T t);
    }
}
