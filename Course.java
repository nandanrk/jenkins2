// Course.java
public class Course {
    // Attributes (fields)
    private String courseName;
    private String courseId;
    private String instructor;
    private int numberOfStudents;

    // Constructor
    public Course(String courseName, String courseId, String instructor, int numberOfStudents) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.instructor = instructor;
        this.numberOfStudents = numberOfStudents;
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course ID: " + courseId);
        System.out.println("Instructor: " + instructor);
        System.out.println("Number of Students: " + numberOfStudents);
    }
}
