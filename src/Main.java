import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Select the Exercise to execute:");
        System.out.println("1 - Take 10 integer inputs from user and store them in an array and print them on screen.");
        System.out.println("2 - Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.");
        System.out.println("3 - Take 20 integer inputs from user and print the following:\n" +
                "number of positive numbers\n" +
                "number of negative numbers\n" +
                "number of odd numbers\n" +
                "number of even numbers\n" +
                "number of 0s.");
        System.out.println("4- Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order. ");
        int exerciseSelection = scanner.nextInt();
        executeSelectedExercise(exerciseSelection);
    }

    private static void executeSelectedExercise(int userSelection){
        switch(userSelection){
            case 1:
                Exercise1.exercise1();
                break;
            case 2:
                Exercise2.exercise2();
                break;
            case 3:
                Exercise3.exercise3();
                break;
        }
    }

}