package school;

public class Student {

    private static int nextStudentId = 1;
    private final int studentId;
    private String name;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
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

        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        // GPA on 4.0 scale

// Calculation to update numberOfCredits
        if (grade < 60.0) courseCredits = 0; // grade = F
        else if (grade >= 60.0 && grade < 70) courseCredits = 1; // grade = D (1 point)
        else if (grade >= 70.0 && grade < 80) courseCredits = 2; // grade = C (2 points)
        else if (grade >= 80.0 && grade < 90) courseCredits = 3; // grade = B (3 points)
        else if (grade >= 90.0 && grade < 100) courseCredits = 4; // grade = A (4 points)

        if (courseCredits >= 1) {
            numberOfCredits = numberOfCredits + courseCredits;
        }

// TODO: figure out this quality score / GPA calculation stuff

        qualityScore = gpa * numberOfCredits;
        newQualityScore = gradePoints * courseCredits;
        newGpa = qualtyScore / numberOfCredits;


    }

    public String getGradeLevel(String gradeLevel) {
        // Determine the grade level of the student based on numberOfCredits
        // For each passing class (D 60% or higher) student earns one credit/year
        // Each year, students can earn up to 6 credits for a 4.0

        gradeLevel = "";

        // Under 6 = Freshman
        if (numberOfCredits <= 29) gradeLevel = "Freshman";
        // 6 - 12 = Sophomore
        if (30 <= numberOfCredits && numberOfCredits <= 59) gradeLevel = "Sophomore";
        // 12 - 18 = Junior
        if (60 <= numberOfCredits && numberOfCredits <= 89) gradeLevel = "Junior";
        // 18 - 24 = Senior
        if (numberOfCredits >= 90) gradeLevel = "Senior";

        return gradeLevel;


    }


    /* getters and setters for fields: name, numberOfCredits, GPA. studentID
     * doesn't need a getter/setter as it is a final field. */

    public int getStudentId() {
        return studentId;
    }

    public static void setStudentId(int studentId) {
        Student.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    protected double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }
}
