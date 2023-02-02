package FunctionalInterfaces;

import java.util.Scanner;

public class NumberSupplier {

    public static void main(String[] args) {
        System.out.println("Printing a list of random numbers..");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the desired list : ");
        printNumbers(scanner.nextInt());
    }

    private static void printNumbers(Integer listSize) {
        System.out.println();
        new RandomNumberSupplier(listSize).get()
                .stream()
                .forEach(System.out::println);
        System.out.println();
    }
}
