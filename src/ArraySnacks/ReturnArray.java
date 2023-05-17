package ArraySnacks;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arrayHolder = new int[4];
        int holder;
        for (int index = 0; index < arrayHolder.length; index++) {
            System.out.print("Enter a number: ");
            int userNumber = input.nextInt();
            arrayHolder[index] = userNumber;
        }
        System.out.println("The number has been return in an array: "+Arrays.toString(arrayHolder));
    }
}
