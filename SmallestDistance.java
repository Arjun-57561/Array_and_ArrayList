import java.util.Scanner;

public class SmallestDistance {

    // Method to find index of the first number with the smallest neighboring distance
    public static int findSmallestNeighboringDistance() {
        Scanner scanner = new Scanner(System.in); // Initialize scanner

        System.out.println("<< Find Smallest Neighboring Distance >>\n");

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        // Validate input size
        if (size < 2) {
            System.out.println("Array must have at least 2 elements.");
            scanner.close();
            return -1;
        }

        double[] arr = new double[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
        }

        scanner.close(); // Close scanner

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

        System.out.println("Index of first number with smallest neighboring distance: " + index +"\n");
        return index;
    }
}
