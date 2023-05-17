package ChapterFour;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO: I'm really trying for this printing of triangle.
        System.out.print("Enter a number: ");
        int userNumber = input.nextInt();
        for (int index = 1; index <= userNumber; index++) {
            for (int secondIndex = 1; secondIndex <= index; secondIndex++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
