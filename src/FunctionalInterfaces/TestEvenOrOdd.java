package FunctionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

public class TestEvenOrOdd {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("The Even Numbers in the List are the following");
        filterAndPrint(numbers, new EvenPredicate());
        System.out.println("The Odd Numbers in the List are the following");
        filterAndPrint(numbers, new OddPredicate());
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers
                .stream()
                .filter(predicate)
                .forEach(System.out::println);
        System.out.println();
    }
}
