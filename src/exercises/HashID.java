package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Make a program similar to GradebookHashMap, but which takes in students names
// and ID numbers (as integers) instead of names and grades. In this case, however,
// the keys should be integers (the IDs) and the values should be strings (the names).
// Modify the roster printing code accordingly.

public class HashID {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int IdNum;
        String studentName;

        // Get student IDs
        do {
            System.out.println("Enter your students' ID number (hit ENTER when finished): ");
            studentName = in.nextLine();

            if (!studentName.equals("")) {
                IdNum = Integer.parseInt(studentName);
                System.out.printf("Enter name for student %d: ", IdNum);
                studentName = in.nextLine();

                students.put(IdNum, studentName);
            }

        } while(!studentName.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet())
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

    }

}

