class AverageThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double average = sum / 10.0;
        System.out.println("The average of the first 10 numbers is: " + average);
    }
}

class SquareThread extends Thread {
    private int[] arr;

    public SquareThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        System.out.println("Squares of numbers in the array:");
        for (int num : arr) {
            System.out.println("Square of " + num + ": " + (num * num));
        }
    }
}

public class ThreadAverageSquare {
    public static void main(String[] args) {
        int[] arr = { 1, 20, 50, 15, 30 };

        SquareThread squareThread = new SquareThread(arr);
        AverageThread averageThread = new AverageThread();

        try {

            squareThread.start();
            squareThread.join();

            averageThread.start();
            averageThread.join();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
