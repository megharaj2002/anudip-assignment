import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();
        
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } else if (marks >= 81 && marks <= 100) {
            System.out.println("Distinction");
        } else if (marks >= 61 && marks <= 80) {
            System.out.println("First Class");
        } else if (marks >= 41 && marks <= 60) {
            System.out.println("Second Class");
        } else if (marks >= 35 && marks <= 40) {
            System.out.println("Pass");
        } else { 
            System.out.println("Fail");
        }
        
        scanner.close();
    }
}
