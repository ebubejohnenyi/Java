package PersonalExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CollectArraysEqualInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arrayHolder = new int[11];
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
        int gottenDivideResult = 0, holderActualNumber = 0;
        for (int index = 1; index < arrayHolder.length; index++) {

//            try {
//                int [] arrayHolder = int [100];
//                System.out.println(arrayHolder[0]);
//            }catch (ArrayIndexOutOfBoundsException ex){
//                System.out.println(ex);
//            }

            arrayHolder[index] = index;
            if (userInput <= 0) {
                System.out.println("Take this shit outta my face.!");
                arrayHolder[index] = 0;
                break;
            }
            //else gottenDivideResult = userInput % arrayHolder[index];
            else gottenDivideResult = userInput / arrayHolder[index];
            holderActualNumber = gottenDivideResult + arrayHolder[index];
            if (gottenDivideResult + arrayHolder[index] == userInput){
                System.out.println("The result is: " + gottenDivideResult + " + " + arrayHolder[index] + " = " +  holderActualNumber);
            }
        }
        System.out.println(Arrays.toString(arrayHolder));
    }
}
