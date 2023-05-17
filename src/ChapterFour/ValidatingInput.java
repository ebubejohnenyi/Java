package ChapterFour;

import java.util.Scanner;

public class ValidatingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (1/2): ");
        int userInput = input.nextInt();
        while(userInput != 2 && userInput !=1){
            System.out.print("Enter correct number: ");
            int userNumber = input.nextInt();
        }
    }
}
