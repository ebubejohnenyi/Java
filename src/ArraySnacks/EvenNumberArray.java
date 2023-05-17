package ArraySnacks;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] arrayHolder = new int[5];
        for (int index = 0; index < arrayHolder.length;) {
            System.out.print("Enter a number: ");
            int userNumber = input.nextInt();
            if(userNumber % 2 == 0){
                arrayHolder[index] = userNumber;
                if(arrayHolder[index] == 5){
                    break;
                }
                else {
                    index++;
                }
            }
        }
        System.out.println("The even number of user input is: " + Arrays.toString(arrayHolder));
    }
}
