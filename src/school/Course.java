package school;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private final int courseNumber;
    private  int studentId;
    private boolean isStudentEnrolled = true;
    private ArrayList<HashMap<courseNumber, studentId>> allEnrolled;


    public Course(int courseNumber, int studentId,
                   int numberOfCredits, double gpa) {
        this.courseNumber = courseNumber;
        this.studentId = studentId;
        this.isStudentEnrolled = isStudentEnrolled;
        this.allEnrolled = allEnrolled;
    }
}
