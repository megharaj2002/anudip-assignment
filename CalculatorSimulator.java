import java.util.Scanner;

class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {

    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

        if (!isIndian) {
            throw new CountryNotValidException(
                    "The employee should be an Indian citizen for calculating tax");
        }

        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException(
                    "The employee name cannot be empty");
        }

        double taxAmount;

        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException(
                    "The employee does not need to pay tax");
        }

        return taxAmount;
    }
}

public class CalculatorSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaxCalculator calculator = new TaxCalculator();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Is Employee Indian? (true/false): ");
        boolean isIndian = sc.nextBoolean();

        System.out.print("Enter Employee Salary: ");
        double empSal = sc.nextDouble();

        try {
            double tax = calculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + tax);

        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        sc.close();
    }
}
