package ChapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arrayHolder = new int[10];
        int sum = 0, userNumber = 0;

        for (int index = 0; index <= arrayHolder.length; index++) {
            System.out.print("Enter a number: ");
            userNumber = input.nextInt();
            if ((userNumber % 2)==0){
                sum += userNumber;
                arrayHolder[index] = userNumber;
            }
        }
        System.out.println("The sum of even numbers is: " + sum);
        System.out.println(Arrays.toString(arrayHolder));
    }
}
