package FunctionalInterfaces;

import java.util.List;
import java.util.Scanner;

public class NumberSupplier {

    public static void main(String[] args) {
        System.out.println("Printing a list of random numbers..");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the desired list : ");
        Integer listSize = scanner.nextInt();
        List<Integer> randomNumbers = getRandomNumberList(listSize);
        printList(randomNumbers);
        squareOfRandomNumberList(randomNumbers);
    }

    private static List<Integer> getRandomNumberList(Integer listSize) {
        System.out.println();
        return new RandomNumberSupplier(listSize).get();
    }

    private static void squareOfRandomNumberList(List<Integer> numbers) {
        System.out.println();
        numbers
                .stream()
                .map(new SquareUnaryOperator())
                .forEach(System.out::println);
        System.out.println();
    }

    private static void printList(List<Integer> numbers) {
        System.out.println();
        numbers
                .stream()
                .forEach(System.out::println);
        System.out.println();
    }
}
