package ArraySnacks;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arrayHolder = new int[5];
        int sum = 0;
        for (int index = 0; index < arrayHolder.length; index++) {
            System.out.print("Enter a number: ");
            int userNumber = input.nextInt();
            sum += arrayHolder[index] = userNumber;
        }
        System.out.println("The sum of the numbers are: " + sum);
    }
}
