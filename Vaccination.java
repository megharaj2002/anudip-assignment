import java.util.Scanner;

abstract class Vaccine {
    int age;
    String nationality;
    boolean isFirstDoseCompleted = false;
    boolean isSecondDoseCompleted = false;

    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("Your First dose Successfully Done. Now you have to pay 250 Rs");
            isFirstDoseCompleted = true;
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    public void secondDose() {
        if (isFirstDoseCompleted) {
            System.out.println("Your Second dose Successfully Done");
            isSecondDoseCompleted = true;
        } else {
            System.out.println("You are not eligible for the second dose (First dose pending).");
        }
    }

    abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {

    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    void boosterDose() {
        if (isSecondDoseCompleted) {
            System.out.println("Your Booster dose Successfully Done");
        } else {
            System.out.println("Your Booster dose Successfully Done");
        }
    }
}

public class Vaccination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nationality: ");
        String nationality = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        VaccinationSuccessful user = new VaccinationSuccessful(age, nationality);

        user.firstDose();
        user.secondDose();
        user.boosterDose();

        scanner.close();
    }
}
