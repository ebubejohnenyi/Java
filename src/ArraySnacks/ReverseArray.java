package ArraySnacks;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int [] arrayReverseHolder = new int[5];
//          for (int index = arrayReverseHolder.length -1; index >= 0 ; index--){
//            System.out.print("Enter a number: ");
//            int userNumber = input.nextInt();
//            arrayReverseHolder[index] = userNumber;
//        }
//        System.out.println(Arrays.toString(arrayReverseHolder));
//    }

    public int [] reverseArrayNumbers(int [] arrayNumber) {
        int [] helpReverse = new int[arrayNumber.length];
        for (int index = arrayNumber.length - 1; index >= 0; index--) {
            for (int secondIndex = 0; secondIndex < helpReverse.length; secondIndex++) {
                helpReverse[secondIndex] = index;
            }
        }
        return helpReverse;
    }
}
