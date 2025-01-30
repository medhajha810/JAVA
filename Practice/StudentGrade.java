import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks (0-100): ");
        if (scanner.hasNextInt()) {
            int marks = scanner.nextInt();

            if (marks >= 0 && marks <= 100) {
                char grade;
                if (marks >= 90) {
                    grade = 'A';
                } else if (marks >= 80) {
                    grade = 'B';
                } else if (marks >= 70) {
                    grade = 'C';
                } else if (marks >= 60) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }

                // Display result
                System.out.println("The grade is: " + grade);
            } else {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
            }
        } else {
            System.out.println("Invalid input! Please enter a positive integer.");
        }

        scanner.close();
    }
}
