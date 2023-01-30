package FunctionalProgrammingBasic;

import java.util.List;

public class StreamAList {
    public static void main(String[] args) {
        printEvenNumbersInList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    private static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    private static void printEvenNumbersInList(Integer... numbers) {
        List.of(numbers).stream().filter(StreamAList::isEven).forEach(System.out::println);
    }
}
