package ArraySnacks;

import java.util.Arrays;
import java.util.Scanner;

public class differentArrayConcate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] arrayNumber = new String[3];
        String [] arrayLetter = new String[3];
        String [] combineArray = new String[arrayNumber.length + arrayLetter.length];
        for (int firstIndex = 0; firstIndex < arrayNumber.length; firstIndex++) {
            System.out.print("Enter a number: ");
            String userNumber = input.nextLine();
            arrayNumber[firstIndex] = userNumber;
            combineArray[firstIndex] = arrayNumber[firstIndex];
        }
        System.out.println(Arrays.toString(arrayNumber) + "\n");

        for (int secondIndex = 0; secondIndex < arrayLetter.length; secondIndex++) {
            System.out.print("Enter any name/alphabet: ");
            String userLetter = input.nextLine();
            arrayLetter[secondIndex] = userLetter;
            combineArray[secondIndex + arrayNumber.length] = arrayLetter[secondIndex];
        }
        System.out.println(Arrays.toString(arrayLetter) + "\n");
        System.out.println(Arrays.toString(combineArray));
     }
}
