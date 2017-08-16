package school;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private final int courseNumber;
    private boolean whereStudentEnrolled = true;
    private ArrayList<HashMap<Course, Student>> allEnrolled;


    public Course(int courseNumber, int studentId,
                   int numberOfCredits, double gpa) {
        this.courseNumber = courseNumber;
        this.whereStudentEnrolled = whereStudentEnrolled;
        this.allEnrolled = allEnrolled;
    }

    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) o;
        return theCourse.getCourseNumber() == getCourseNumber();
    }

    /* getters and setters */

    public int getCourseNumber() {
        return courseNumber;
    }

    public static void setCourseNumber(int courseNumber) {
        Course.courseNumber = courseNumber;
    }

    public boolean isWhereStudentEnrolled() {
        return whereStudentEnrolled;
    }

    public void setWhereStudentEnrolled(boolean whereStudentEnrolled) {
        this.whereStudentEnrolled = whereStudentEnrolled;
    }

    public ArrayList<HashMap<Course, Student>> getAllEnrolled() {
        return allEnrolled;
    }

    public void setAllEnrolled(ArrayList<HashMap<Course, Student>> allEnrolled) {
        this.allEnrolled = allEnrolled;
    }
}

