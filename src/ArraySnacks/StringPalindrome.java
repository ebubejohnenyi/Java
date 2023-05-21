package ArraySnacks;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reversed = "";
        System.out.print("Enter a name: ");
        String userInput = input.nextLine().toLowerCase();
        boolean checker = false;
        for (int index = userInput.length() - 1; index >= 0; index--) {
            reversed += userInput.charAt(index);
            if(reversed.equals(userInput)){
                checker = true;
            }
        }
        if(checker){
            System.out.println("This is a palindrome.");
        }
        else System.out.println("This is not a palindrome.");

        System.out.println(reversed);
    }

}
