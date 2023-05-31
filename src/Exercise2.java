import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void exercise2(){
        int arrayInput[] = new int[10];
        System.out.println("2 - Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.");
        System.out.println("Insert 10 integers to save inside the array");
        for(int counter=0;counter<arrayInput.length;counter++){
            arrayInput[counter]=scanner.nextInt();
        }

        System.out.println("Insert a number to verify if it is saved within the array");
        int number = scanner.nextInt();;

        Arrays.sort(arrayInput);
        int indexContainingNumber = Arrays.binarySearch(arrayInput, number);

        String result = indexContainingNumber<0 ? "Number not contained inside the array" : "Number is present in the array";
        System.out.println(result);
    }
}
