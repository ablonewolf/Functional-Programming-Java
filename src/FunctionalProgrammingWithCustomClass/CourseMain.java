package FunctionalProgrammingWithCustomClass;

import java.util.Comparator;
import java.util.List;

public class CourseMain {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Java and OOP", "Programming Language", 8, 65),
                new Course("Data Structure And Algorithms", "Algorithm Course", 9, 55),
                new Course("Relational Database", "Database Course", 6, 50),
                new Course("Spring Boot", "Framework Course", 7, 60),
                new Course("React", "Framework Course", 8, 60),
                new Course("Computer Networking", "Theory Course", 8, 50)
        );

        System.out.println(courses.stream().allMatch(course -> course.getNumberOfStudents() > 40));
        System.out.println();
        Comparator<Course> comparatorByNumberOfStudents = Comparator.comparing(Course::getNumberOfStudents);
        System.out.println("Sorting all the courses by the number of students");
        printSortedCourses(courses,comparatorByNumberOfStudents);
        System.out.println();
        System.out.println("Printing the top 3 courses.");
        printSortedCoursesLimit(courses,comparatorByNumberOfStudents,3);
        Comparator<Course> courseComparatorByNoOfStudentDesc = Comparator
                .comparing(Course::getNumberOfStudents)
                .reversed();
        System.out.println("Sorting all the courses by the number of students in decreasing order.");
        printSortedCourses(courses,courseComparatorByNoOfStudentDesc);

        Comparator<Course> courseComparatorByStudentsAndReview = comparatorByNumberOfStudents
                .thenComparing(Course::getReviewScore).
                reversed();
        System.out.println("Sorting all the courses on basis of number of students and review score.");
        printSortedCourses(courses, courseComparatorByStudentsAndReview);

    }

    private static void printSortedCourses(List<Course> courses, Comparator<Course> courseComparator) {
        courses
                .stream()
                .sorted(courseComparator)
                .forEach(System.out::println);
        System.out.println();
    }

    private static void printSortedCoursesLimit(List<Course> courses, Comparator<Course> courseComparator, Integer limit) {
        courses
                .stream()
                .sorted(courseComparator)
                .limit(limit)
                .forEach(System.out::println);
        System.out.println();
    }
}
