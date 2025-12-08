import java.util.Scanner;

public class MultiDimensionalExample {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

       
        int branches = 2;
        int batches = 2;
        int students = 5;

       
        int arr[][][] = new int[branches][batches][students];

     
        for (int i = 0; i < branches; i++) {
            System.out.println("Branch " + (i + 1) + ":");

            for (int j = 0; j < batches; j++) {
                System.out.println("  Batch " + (j + 1) + ":");

                for (int k = 0; k < students; k++) {
                    System.out.print("    Enter marks of student " + (k + 1) + ": ");
                    arr[i][j][k] = s.nextInt();
                }
            }
            System.out.println();
        }

       
        System.out.println("\n--- Displaying Marks ---\n");

        for (int i = 0; i < branches; i++) {
            System.out.println("Branch " + (i + 1) + ":");

            for (int j = 0; j < batches; j++) {
                System.out.print("  Batch " + (j + 1) + ": ");

                for (int k = 0; k < students; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        s.close();
    }
}
