import java.util.Scanner;

public class Exercise3 {
    private static Scanner scanner = new Scanner(System.in);
    public static void exercise3(){
        System.out.println("3 - Insert 20 integer");

        int array20integers [] = new int[20];
        for (int currentIndex=0;currentIndex<array20integers.length;currentIndex++){
            array20integers[currentIndex]=scanner.nextInt();
            countZerosPositivesAndNegatives(array20integers[currentIndex]);
            countOddAndEvenNumbers(array20integers[currentIndex]);
        }

        System.out.println("Number of positive numbers: "+numberOfPositiveNum+"/nNumber of negative numbers: "+numberOfNegativeNum+
                "/nNumber of odd numbers: "+numberOfOddNum+"/nNumber of even numbers: "+numberOfEvenNum+"Number of 0s: "+numberOfZeros);
    }
    static int numberOfPositiveNum=0;
    static int numberOfOddNum=0;
    static int numberOfEvenNum=0;
    static int numberOfZeros=0;
    static int numberOfNegativeNum = 0;
    private static void countZerosPositivesAndNegatives(int currentArrayValue){
        if(currentArrayValue==0){
            numberOfZeros++;
        }else if(currentArrayValue<0){
            numberOfNegativeNum++;
        }else{
            numberOfPositiveNum++;
        }
    }

    private static void countOddAndEvenNumbers(int currentArrayValue){
        if (currentArrayValue==0 || currentArrayValue%2==0){
            numberOfEvenNum++;
        }else{
            numberOfOddNum++;
        }
    }
}
