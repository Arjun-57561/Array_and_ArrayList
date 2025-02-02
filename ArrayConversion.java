import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConversion {
    
    // Method to convert an array to an ArrayList and vice versa
    public static void convertArrayAndArrayList() {
        // Initialize a string array
        System.out.println("<< Convert Array and ArrayList >> \n");
        String[] array = {"noob", "Moon", "Mass"};

        // Convert array to ArrayList
        List<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("Converted Array to ArrayList: " + list);

        // Convert ArrayList back to array
        String[] newArray = list.toArray(new String[0]);
        System.out.println("Converted ArrayList back to Array: " + Arrays.toString(newArray));
    }
}
