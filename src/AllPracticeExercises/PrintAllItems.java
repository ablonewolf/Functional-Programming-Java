package AllPracticeExercises;

import java.util.Comparator;
import java.util.List;

public class PrintAllItems {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printItems(courses);
        printItemsWithSpring(courses);
        printItemsWithFourLetters(courses);
        printLengthOfWords(courses);
        printInNaturalOrder(courses);
        printInReverseOrder(courses);
        printInOrderOfLength(courses);
    }

    private static void printItems(List<String> courses) {
        System.out.println("Printing all the courses");
        courses.
                stream().
                forEach(System.out::println);
        System.out.println();
    }

    private static void printItemsWithSpring(List<String> courses) {
        System.out.println("Printing the courses which has the word Spring");
        courses.
                stream().
                filter(course -> course.contains("Spring")).
                forEach(System.out::println);
        System.out.println();
    }

    private static void printItemsWithFourLetters(List<String> items) {
        System.out.println("Printing items which have atleast 4 characters.");
        items.
                stream().
                filter(item -> item.length() >= 4).
                forEach(System.out::println);
        System.out.println();
    }

    private static void printLengthOfWords(List<String> items) {
        System.out.println("Printing the length of each word in the list.");
        items.
                stream().
                map(item -> item.length()).
                forEach(System.out::println);
        System.out.println();
    }

    private static void printInNaturalOrder(List<String> items) {
        System.out.println("Printing items in the natural order.");
        items.
                stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
        System.out.println();
    }

    private static void printInReverseOrder(List<String> items) {
        System.out.println("Printing items in the reverse order.");
        items
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println();
    }

    private static void printInOrderOfLength(List<String> items) {
        System.out.println("Printing items in the order based on their length.");
        items
                .stream()
                .sorted(Comparator.comparing(item -> item.length()))
                .forEach(System.out::println);
        System.out.println();
    }
}
