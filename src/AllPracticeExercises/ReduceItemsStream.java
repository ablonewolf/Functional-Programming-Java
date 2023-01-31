package AllPracticeExercises;

import java.util.List;

public class ReduceItemsStream {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Sum of the squares of the numbers of the List " + numbers + " is " + sumOfSquaresOfNumbersOfList(numbers));
        System.out.println("Sum of the cubes of the numbers of the List " + numbers + " is " + sumOfCubesOfNumbersOfList(numbers));
        System.out.println("Sum of the odd numbers of the List " + numbers + " is " + sumOfOddNumbersOfList(numbers));
    }

    private static Integer sumOfSquaresOfNumbersOfList(List<Integer> numbers) {
        return numbers
                .stream()
                .map(number -> number * number)
                .reduce(0, Integer::sum);
    }

    private static Integer sumOfCubesOfNumbersOfList(List<Integer> numbers) {
        return numbers
                .stream()
                .map(number -> number * number * number)
                .reduce(0, Integer::sum);
    }

    private static Integer sumOfOddNumbersOfList(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(number -> number % 2 != 0)
                .reduce(0,Integer::sum);
    }
}
