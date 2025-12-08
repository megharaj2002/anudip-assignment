import java.util.Scanner;

public class ExampleForMultiDimensional {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

 
        System.out.print("Enter number of batches: ");
        int batches = s.nextInt();

        System.out.print("Enter number of students in each batch: ");
        int students = s.nextInt();


        int[][] marks = new int[batches][students];

        // input
        for (int i = 0; i < batches; i++) {
            System.out.println("Batch " + (i + 1) + ":");
            for (int j = 0; j < students; j++) {
                System.out.print("  Enter marks of student " + (j + 1) + ": ");
                marks[i][j] = s.nextInt();
            }
        }

        System.out.println("\n--- Displaying Marks (Batch x Student) ---");

   
        for (int i = 0; i < batches; i++) {
            System.out.print("Batch " + (i + 1) + ": ");
            for (int j = 0; j < students; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();   
        }

        s.close();
    }
}
