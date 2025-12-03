import java.util.Scanner;

public class CheckPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is not positive (it is negative).");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
