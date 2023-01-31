package FunctionalProgrammingBasic;

import java.util.List;
import java.util.stream.Stream;

public class StreamAListOfNumbers {
    public static void main(String[] args) {
        printEvenNumbersInList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printSquareOfEvenNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        printCubeOfOddNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    private static void printEvenNumbersInList(Integer... numbers) {
        System.out.println("Printing the even numbers in the list.");
        Stream.of(numbers).filter(number -> number % 2 == 0).forEach(System.out::println);
        System.out.println();
    }

    private static void printSquareOfEvenNumbers(List<Integer> numbers) {
        System.out.println("Printing squares of even numbers in a list.");
        numbers.
                stream().
                filter(number -> number % 2 == 0).
                map(number -> number * number).
                forEach(System.out::println);
        System.out.println();
    }

    private static void printCubeOfOddNumbers(List<Integer> numbers) {
        System.out.println("Printing cube of odd numbers in the list.");
        numbers.
                stream().
                filter(number -> number % 2 != 0).
                map(number -> number * number * number).
                forEach(System.out::println);
        System.out.println();
    }
}
