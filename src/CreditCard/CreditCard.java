package CreditCard;
import java.util.Arrays;
import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        validatingUserCreditCard();
    }

    public static void validatingUserCreditCard() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hello, Kindly Enter Card details to verify: ");   // 3788576018402626
        String userCreditDetails = scan.nextLine();
        String holdfirst = String.valueOf(userCreditDetails.charAt(0));
        String holdfsecond = String.valueOf(userCreditDetails.charAt(1));
        String join = holdfirst + holdfsecond;
        for (int count = 0; count < 1; count++) {
            if (userCreditDetails.startsWith(String.valueOf(4))){
                System.out.println("This is a Visa Card:  " + userCreditDetails);
                break;
            }
            else if(userCreditDetails.startsWith(String.valueOf(5))){
                System.out.println("This is a Master Card:  " + userCreditDetails);
                break;
            }
            else if(userCreditDetails.startsWith(String.valueOf(6))){
                System.out.println("This is a Discover Card:  " + userCreditDetails);
                break;
            }
            else if (userCreditDetails.startsWith(join)){
                System.out.println("This is a American Card " + userCreditDetails);
                break;
            }
        }

        collectInputIndividually(userCreditDetails);

    }
    public static void collectInputIndividually(String userCreditDetails) {
        String individualIndex = "", doubleHolder = "";
        int doubleNumber, holdIntegerIndex, sumInnerNumber = 0, sumAllNumbers = 0;
        for (int index = 0; index < userCreditDetails.length(); index += 2) {
            individualIndex = String.valueOf(userCreditDetails.charAt(index));
            holdIntegerIndex = Integer.parseInt(individualIndex);
            doubleNumber = holdIntegerIndex * 2;
            if (doubleNumber > 9) {
                for (int secondIndex = 0; secondIndex < 2; secondIndex++){
                    int sumRemainder = 0, remainder;
                    remainder = doubleNumber % 10;
                    sumRemainder += remainder;
                    sumInnerNumber += sumRemainder;
                    doubleNumber /= 10;
                }
            }
            sumInnerNumber += doubleNumber;
        }
        sumAllNumbers += sumInnerNumber;
        System.out.println("The sum of the single digit number: " + sumAllNumbers);

        int sumNumber = 0;
        for (int thirdIndex = userCreditDetails.length() -1; thirdIndex > 0; thirdIndex -= 2) {
            char getOdd = userCreditDetails.charAt(thirdIndex);
            String holdNumber = String.valueOf(getOdd);
            sumNumber += Integer.parseInt(holdNumber);
        }
        System.out.println("The sum of the odd numbers is: " + sumNumber);

        int sumBoth_Number = sumAllNumbers + sumNumber;
        System.out.println("the sum of the first calculation and second is: " + sumBoth_Number);

        if(sumBoth_Number %  10 == 0) System.out.println("The Card is Valid " + userCreditDetails);
        else System.out.println(" The Card is Invalid " + userCreditDetails);

    }
}
