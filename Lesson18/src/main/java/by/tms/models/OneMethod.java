package by.tms.models;

import java.util.Scanner;
import java.util.stream.LongStream;

public class OneMethod {
    private final Scanner console = new Scanner(System.in).useDelimiter("\n");

    public void chooseNumberForOperation() {
        switch (console.nextInt()) {
            case 1 -> {
                OperationAware<String> func = this::reversedString;
                String result = func.operation(console.next());
                System.out.println(result);
            }
            case 2 -> {
                OperationAware<Long> func = value -> factorial(value);
                long result = func.operation(console.nextLong());
                System.out.println(result);
            }
            default -> throw new RuntimeException();
        }
    }

    public String reversedString(String str) {
        return String.valueOf(new StringBuilder(str).reverse());
    }

    public long factorial(long value) {
        return LongStream.rangeClosed(1, value)
                .reduce(1, (long x, long y) -> x * y);
    }

    @FunctionalInterface
    public interface OperationAware<T> {
        T operation(T t);
    }
}
