import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConversion{
    public static void arrayListOperations(){

        String[] array = {"noob","Moon","Mass"};
        List<String> ArrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("Converted Array to ArrayList: " + ArrayList);


        String[] newArray = ArrayList.toArray(new String[0]);

        System.out.println("Converted ArrayList back to String" + Arrays.toString(newArray));
    }   

}