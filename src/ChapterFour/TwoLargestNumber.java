package ChapterFour;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstLargest = 0;
        int secondLargest = 0;
        int holder = 0;
        for (int index = 1; index <= 10; index++) {
            System.out.print("Enter a number: ");
            int userInput = input.nextInt();
            if (userInput > firstLargest) firstLargest = userInput;
            else if (userInput > secondLargest && userInput < firstLargest) secondLargest = userInput;

            System.out.println("The first largest is: " + firstLargest);
            System.out.println("The second largest is: " + secondLargest + "\n");
        }
    }
}
