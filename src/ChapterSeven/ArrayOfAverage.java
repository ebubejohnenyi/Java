package ChapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arrayHolder = new int[5];
        int sum = 0;
        int totalAverage = 0;
        for (int index = 1; index < arrayHolder.length ; index++) {
            System.out.print("Enter a number (" + index +"): ");
            int userNumber = input.nextInt();

            arrayHolder[index] = userNumber;
            sum +=arrayHolder[index];
            totalAverage = sum / arrayHolder.length;
        }
        System.out.println("Your array is: "+ Arrays.toString(arrayHolder));
        System.out.println("The total of the array numbers is: "+ sum);
        System.out.println("The average of the array numbers is: "+ totalAverage);
    }
}
