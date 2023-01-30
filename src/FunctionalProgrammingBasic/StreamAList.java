package FunctionalProgrammingBasic;

import java.util.stream.Stream;

public class StreamAList {
    public static void main(String[] args) {
        printEvenNumbersInList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    private static void printEvenNumbersInList(Integer... numbers) {
        Stream.of(numbers).filter(number -> number % 2 == 0).forEach(System.out::println);
    }
}
