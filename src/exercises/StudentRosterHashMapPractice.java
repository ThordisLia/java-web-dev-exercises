package exercises;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class StudentRosterHashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ID
        do {

            System.out.print("Student ID: ");
            newStudent = input.nextInt();

            if (!newStudent.equals("")) {
                System.out.print("Student name: ");
                String newName = input.next();
                students.put(newStudent, newName);

                // Read in the new int before looping back
                input.nextLine();
            }
        //fix this line
        } while(newStudent < 0);

        // Print class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }
}
