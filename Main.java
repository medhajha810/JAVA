import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private float marks;

    public Student(String name, int rollNumber, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public void updateMarks(float newMarks) {
        this.marks = newMarks;
    }

    public void updateMarks(float percentage, boolean isPercentage) {
        if (isPercentage) {
            this.marks += (this.marks * percentage) / 100;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = scanner.nextLine(); 
        
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();  
        
        System.out.print("Marks: ");
        float marks = scanner.nextFloat(); 
        
        Student student = new Student(name, rollNumber, marks);
        
        student.displayDetails();
        
        System.out.print("\nUpdate marks:\nNew Marks: ");
        float newMarks = scanner.nextFloat();  
        student.updateMarks(newMarks);
        
        System.out.println("\nUpdated Details:");
        student.displayDetails();
        
        System.out.print("\nUpdate marks by percentage increase:\nPercentage: ");
        float percentage = scanner.nextFloat();  
        student.updateMarks(percentage, true);
        
        System.out.println("\nUpdated Details:");
        student.displayDetails();
        
        scanner.close();
    }
}
