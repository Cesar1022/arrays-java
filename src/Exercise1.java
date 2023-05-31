import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void exercise1(){
        int arrayInput[]= new int[10];
        System.out.println("1 - Take 10 integer inputs from user and store them in an array and print them on screen.");
        System.out.println("Insert 10 integers to save inside the array");
        for (int counter=0; counter<arrayInput.length; counter++){
            arrayInput[counter]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayInput));

        for (int counter=0; counter<arrayInput.length; counter++){
            System.out.println(arrayInput[counter]);
        }
    }
}
