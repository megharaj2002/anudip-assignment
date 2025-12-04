import java.util.Scanner;

public class Matrimony {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (male/female): ");
        String gender = sc.next().toLowerCase();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if(gender.equals("female")) {

            if(age >= 18)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible, please wait.");

        } else if(gender.equals("male")) {

            if(age >= 21)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible, please wait.");

        } else {
            System.out.println("Invalid gender");
        }
    }
}
