import java.util.Scanner;

public class SmallestDistance {
    public static void findSmallestDistance() {
        Scanner scanner = new Scanner(System.in); // Initialize scanner

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        double[] arr = new double[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
        }

        // Initialize minimum distance and index
        double minDist = Double.MAX_VALUE;
        int index = -1;

        // Find the smallest neighboring difference
        for (int i = 0; i < arr.length - 1; i++) {
            double diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDist) {
                minDist = diff;
                index = i;
            }
        }

        System.out.println("Index of first number with smallest neighboring distance: " + index);
        
    }
}
