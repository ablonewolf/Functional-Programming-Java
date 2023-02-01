package FunctionalInterfaces;

import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Sum of the numbers is : " + calculateSum(numbers));
    }

    private static Integer calculateSum(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce(0,new SumBinaryOperator());
    }

}
