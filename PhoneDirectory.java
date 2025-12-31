import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>(); 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Find number");
            System.out.println("2. Add number");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    if (phoneBook.containsKey(name)) { 
                        System.out.println("Phone number for " + name + ": " + phoneBook.get(name)); 
                       
                    } else {
                        System.out.println("Number not found for " + name);
                    }
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.put(newName, phoneNumber);
                    System.out.println("Added " + newName + " to phone book.");
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
