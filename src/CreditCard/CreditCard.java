package CreditCard;

import java.util.Arrays;
import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, Kindly Enter Card details to verify: ");
        long [] creditCardArray = new long[16];
        for (int index = 0; index < creditCardArray.length; index++) {
            long userCardNumber = scan.nextLong();
            creditCardArray[index] = userCardNumber;
        }
        System.out.println(Arrays.toString(creditCardArray));
    }
}
