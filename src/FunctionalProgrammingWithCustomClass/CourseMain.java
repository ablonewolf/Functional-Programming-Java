package FunctionalProgrammingWithCustomClass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class CourseMain {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Java and OOP", "Programming Language", 8, 65),
                new Course("Data Structure And Algorithms", "Algorithm Course", 9, 55),
                new Course("Relational Database", "Database Course", 6, 45),
                new Course("Spring Boot", "Framework Course", 7, 40),
                new Course("React", "Framework Course", 8, 60),
                new Course("Computer Networking", "Theory Course", 7, 50)
        );

        System.out.println(courses.stream().allMatch(course -> course.getNumberOfStudents() > 40));
        System.out.println();
        Comparator<Course> comparatorByNumberOfStudents = Comparator.comparing(Course::getNumberOfStudents);
        System.out.println("Sorting all the courses by the number of students");
        printSortedCourses(courses, comparatorByNumberOfStudents);
        System.out.println();
        System.out.println("Printing the top 3 courses.");
        printSortedCoursesLimit(courses, comparatorByNumberOfStudents, 3);
        Comparator<Course> courseComparatorByNoOfStudentDesc = Comparator
                .comparing(Course::getNumberOfStudents)
                .reversed();
        System.out.println("Sorting all the courses by the number of students in decreasing order.");
        printSortedCourses(courses, courseComparatorByNoOfStudentDesc);

        Comparator<Course> courseComparatorByStudentsAndReview = comparatorByNumberOfStudents
                .thenComparing(Course::getReviewScore).
                reversed();
        System.out.println("Sorting all the courses on basis of number of students and review score.");
        printSortedCourses(courses, courseComparatorByStudentsAndReview);
        System.out.println("The Top Course Based On Number of Students and Review is : " + getTopCourse(courses, courseComparatorByStudentsAndReview).getName());
        System.out.println();
        System.out.println("The Least liked Course Based on Number of Students and Review is : " + getLeastLikedCourse(courses, courseComparatorByStudentsAndReview).getName());
        System.out.println();

        Predicate<Course> reviewFilterPredicate = course -> course.getReviewScore() > 7;

        Predicate<Course> studentNumberPredicate = course -> course.getNumberOfStudents() > 50;

        System.out.println("Total number of students involved in the courses with a review higher than 7 is : " + getTotalStudentsBasedOnAPredicate(courses, reviewFilterPredicate));
        System.out.println();
        System.out.println("Average number of students involved in the courses with a review higher than 7 is : " + getAverageNumberOfStudents(courses,reviewFilterPredicate));
        System.out.println();
        System.out.println("The number of courses which has a review of more than 7 is : " + countCourseBasedAFilter(courses,reviewFilterPredicate));
        System.out.println();
        System.out.println("Total number of students involved in the courses which have students more than 50 is : " + getTotalStudentsBasedOnAPredicate(courses,studentNumberPredicate));
        System.out.println();
        System.out.println("Average number of students involved in the courses which have students more than 50 is : " + getAverageNumberOfStudents(courses,studentNumberPredicate));
        System.out.println();
        System.out.println("The number of courses which has students more than 50 is : " + countCourseBasedAFilter(courses,studentNumberPredicate));
        System.out.println();
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

    private static Course getTopCourse(List<Course> courses, Comparator<Course> courseComparator) {
        return courses
                .stream()
                .min(courseComparator)
                .get();
    }

    private static Course getLeastLikedCourse(List<Course> courses, Comparator<Course> courseComparator) {
        return courses
                .stream()
                .max(courseComparator)
                .get();
    }

    private static Integer getTotalStudentsBasedOnAPredicate(List<Course> courses, Predicate<Course> coursePredicate) {
        return courses
                .stream()
                .filter(coursePredicate)
                .mapToInt(Course::getNumberOfStudents)
                .sum();
    }

    private static Double getAverageNumberOfStudents(List<Course> courses, Predicate<Course> coursePredicate) {
        return courses
                .stream()
                .filter(coursePredicate)
                .mapToInt(Course::getNumberOfStudents)
                .average().getAsDouble();
    }

    private static Long countCourseBasedAFilter(List<Course> courses, Predicate<Course> coursePredicate) {
        return courses
                .stream()
                .filter(coursePredicate)
                .count();
    }

}
