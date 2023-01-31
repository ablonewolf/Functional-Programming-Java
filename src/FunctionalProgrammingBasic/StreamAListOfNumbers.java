package FunctionalProgrammingBasic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAListOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        printEvenNumbersInList(numbers);
        printSquareOfEvenNumbers(numbers);
        printCubeOfOddNumbers(numbers);
        System.out.println("Printing the even numbers in the list " + numbers + " " + listOfEvenNumbers(numbers));
    }

    private static void printEvenNumbersInList(List<Integer> numbers) {
        System.out.println("Printing the even numbers in the list.");
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
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

    private static List<Integer> listOfEvenNumbers(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }
}
