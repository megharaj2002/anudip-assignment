public class Printer {

    public void printDetails(String name, int age) {
        System.out.println("Method 1: printDetails(String name, int age)");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public void printDetails(int age, String name) {
        System.out.println("Method 2: printDetails(int age, String name)");
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println();
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        System.out.println("=== Demonstrating Method Overloading ===");
        System.out.println();

        printer.printDetails("Alice", 25);

        printer.printDetails(30, "Bob");

        
        
    }
}
