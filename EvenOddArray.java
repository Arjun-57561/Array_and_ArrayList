import java.util.ArrayList;
import java.util.Scanner;


public class EvenOddArray{
    public static void seperateEvenOdd(){
        Scanner sc = new Scanner(System.in);


        // Defining arrays for Even and odd numbers.. 
        ArrayList<Integer> even = new ArrayList<>(); 
        ArrayList<Integer> odd = new ArrayList<>();

        //Taking the input of no of elements
        System.out.println("Enter the no of Elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + "numbers");
        for (int i=0;i<n;i++){
            int num = sc.nextInt();
            if (num%2 == 0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }

        System.out.println("EvenNumbers : "+ even + "\n OddNumbers : "+ odd);
    }
}