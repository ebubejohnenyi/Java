package ChapterSeven;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StoreOnlyEvenIntegerArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arrayHolder = new int[5];
        for (int index = 0; index < arrayHolder.length;) {
            System.out.print("Enter a number: ");
            //int userNumber = input.nextInt();
            int userNumber=0;

            try {
                userNumber = input.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println(ime);
            }

            if (userNumber % 2 == 0) {
                arrayHolder[index] = userNumber;
                if (arrayHolder[index] == 5) {
                    break;
                } else {
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(arrayHolder));
        System.out.println("All the element in th array is even");

    }
}
