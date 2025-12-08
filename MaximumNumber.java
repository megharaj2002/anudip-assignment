import java.util.Scanner;

public class MaximumNumber {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (num1): ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number (num2): ");
        int num2 = scanner.nextInt();
        int maximum = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + maximum);
        scanner.close();
    }
}
