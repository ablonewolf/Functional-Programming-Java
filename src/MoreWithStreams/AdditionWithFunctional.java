package MoreWithStreams;

import java.util.List;

public class AdditionWithFunctional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Sum of the List : " + numbers + " is " + sumOfNumbersOfAList(numbers));
    }

    private static Integer add(Integer a, Integer b) {
        return a + b;
    }

    private static Integer sumOfNumbersOfAList(List<Integer> numbers) {
        return numbers.
                stream().
                reduce(0, AdditionWithFunctional::add);

    }

}
