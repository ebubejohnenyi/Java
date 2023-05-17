package ChapterFour;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int largestNumber = 0;
//        int loopTill = 10;
//        for (int index = 0; index < loopTill; index++) {
//            System.out.print("Enter a number: ");
//            int userNumber = input.nextInt();
//            if (userNumber > largestNumber ) largestNumber = userNumber;
//        }
//        System.out.printf("The largest number is %d", largestNumber);
    }

    private int largeNumber;
    private int userNumber;
    int holder;
    public void setUserNumber(int userNumber) {
            if(userNumber > largeNumber) largeNumber = userNumber;
            else if (userNumber <= 0 ) this.userNumber = 0;
    }
    public int getUserNumber() {
        return largeNumber;
    }

    public void checkForLarge() {
        holder = getUserNumber();
    }

    public int getCheckerForLarge() {
        return holder;
    }
}
