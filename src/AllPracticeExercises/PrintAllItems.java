package AllPracticeExercises;

import java.util.List;

public class PrintAllItems {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printItems(courses);
        printItemsWithSpring(courses);
    }

    private static void printItems(List<String> courses) {
        System.out.println("Printing all the courses");
        courses.stream().forEach(System.out::println);
        System.out.println();
    }

    private static void printItemsWithSpring(List<String> courses) {
        System.out.println("Printing the courses which has the word Spring");
        courses.stream().filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
        System.out.println();
    }
}
