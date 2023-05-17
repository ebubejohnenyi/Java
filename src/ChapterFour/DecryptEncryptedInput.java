package ChapterFour;

import java.util.Scanner;

public class DecryptEncryptedInput {
    public static void main(String[] args) {
        // TODO: I WILL BE WORKING ON THIS MORE....

        Scanner input = new Scanner(System.in);
        int userNumber, firstNumber, secondNumber, thirdNumber, fourthNumber, tempOne, tempTwo;
        System.out.print("Enter five (5) numbers: ");
        userNumber = input.nextInt();
        if (userNumber <= 9999) System.out.println("This number can't be decrypted. Enter (5) digit.!!");
        else if (userNumber > 999999) System.out.println("This number is too big");
        else {
            fourthNumber = (userNumber / 1000) % 10 + 7 - 7;
            thirdNumber = (userNumber / 100) % 10 + 7 - 7;
            secondNumber = (userNumber / 10) % 10 + 7 - 7;
            firstNumber = userNumber % 10 + 7 - 7;

            tempOne = firstNumber;
            firstNumber = thirdNumber;
            thirdNumber = tempOne;

            tempTwo = secondNumber;
            secondNumber = fourthNumber;
            fourthNumber = tempTwo;

            int firstTemp, secondTemp, thirdTemp, fourthTemp;

            firstTemp = tempOne; //  holding the first number
            thirdTemp = firstNumber; // holding the third number
            secondTemp = tempTwo; //  holding the second number
            fourthTemp = secondNumber; // holding the third number

            System.out.println("Encrypted number is: " + firstTemp + "" + secondTemp + "" + thirdTemp + "" + fourthTemp);

        }
    }
}
