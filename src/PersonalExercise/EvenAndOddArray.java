package PersonalExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberLink = 0;
        int [] arrayHolder = new int[10];
        for (int index = 0; index < 10; index++) {
            System.out.print("Enter a number: ");
            int userNumber = input.nextInt();
            if (userNumber % 2 == 0) System.out.println("This is an Even Number");
            else System.out.println("This is an Odd number");
            arrayHolder[index] = userNumber;
            numberLink += userNumber;
        }
        System.out.println(Arrays.toString(arrayHolder));
        System.out.println("The numberLink is: " + numberLink);

    }
}
