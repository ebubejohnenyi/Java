package ChapterFour;

import java.util.Scanner;

public class DecryptEncryptedeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNumber, firstNumber, secondNumber, thirdNumber, fourthNumber, tempOne, tempTwo;
        System.out.print("Enter four (4) numbers: ");
        userNumber = input.nextInt();
        if (userNumber <= 999) System.out.println("This is  negative number.");
        else if (userNumber > 9999) {
            System.out.println("This number is too big");
        }
        fourthNumber = (userNumber / 1000) % 10 + 7;
        thirdNumber = (userNumber / 100) % 10 + 7;
        secondNumber = (userNumber / 10) % 10 + 7;
        firstNumber = userNumber % 10 + 7;
        tempOne = firstNumber;
        firstNumber = thirdNumber;
        thirdNumber = tempOne;
        tempTwo = secondNumber;
        secondNumber = fourthNumber;
        fourthNumber = tempTwo;
        System.out.println("Encrypted number is: " + firstNumber+ "" + secondNumber + "" + thirdNumber + "" +fourthNumber);

    }
}
