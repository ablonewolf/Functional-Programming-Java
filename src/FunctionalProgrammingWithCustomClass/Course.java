package FunctionalProgrammingWithCustomClass;

public class Course {
    private String name;
    private String category;
    private Integer reviewScore;
    private Integer numberOfStudents;

    public Course(String name, String category, Integer reviewScore, Integer numberOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(Integer reviewScore) {
        this.reviewScore = reviewScore;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", reviewScore=" + reviewScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
