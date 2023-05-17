package PersonalExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayHolder = new int[10];
//        StringBuilder reverseNumber = null;
        for (int index = arrayHolder.length -1; index >= 0; index--) {
            System.out.print("Enter a number: ");
            int userNumber = input.nextInt();
            arrayHolder[index] = userNumber;
//            reverseNumber = new StringBuilder();
//            reverseNumber.append(Arrays.toString(arrayHolder));
//            reverseNumber.reverse();
        }
        System.out.println(Arrays.toString(arrayHolder));
    }
}
