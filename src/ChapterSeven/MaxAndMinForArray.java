package ChapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinForArray {
    public static void main(String[] args) {
        MaxAndMinForArray.arrayLink();
    }
    private static int [] arrayHolder;
    public static void arrayLink() {
        Scanner input = new Scanner(System.in);
        int[] arrayNumber = new int[5];
        int max = 0;
        int min = 0;
        for (int index = 0; index < arrayNumber.length; index++) {
            System.out.print("Enter a number: ");
            int userInput = input.nextInt();
            arrayNumber[index] = userInput;
            if (userInput > max) {
                max = userInput;
            }
            else if (userInput < max) {
                min = userInput;
            }
        }
        System.out.println(Arrays.toString(arrayNumber));
        System.out.println("The max of the array is: " + max);
        System.out.println("The min of the array is: " + min);

    }
    public static int [] getArrayLink(){
        return arrayHolder;
    }
}
