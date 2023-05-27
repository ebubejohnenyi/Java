package CreditCard;
import java.util.Arrays;
import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        validatingUserCreditCard();
    }

    public static void validatingUserCreditCard() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hello, Kindly Enter Card details to verify: ");
        String userCreditCard = scan.nextLine();
        check_TypeOf_Card(userCreditCard);
        collectInputIndividually(userCreditCard);
    }

    public static void check_TypeOf_Card(String userCreditDetails) {
        String join = firstAnd_SecondIndex(userCreditDetails);
        for (int count = 0; count < 1; count++) {
            if (userCreditDetails.startsWith(String.valueOf(4))){
                System.out.println("**Credit Card Type:  Visa Card");
                break;
            }
            else if(userCreditDetails.startsWith(String.valueOf(5))){
                System.out.println("**Credit Card Type:  Master Card");
                break;
            }
            else if(userCreditDetails.startsWith(String.valueOf(6))){
                System.out.println("**Credit Card Type:  Discover Card");
                break;
            }
            else if (userCreditDetails.startsWith(join)){
                System.out.println("**Credit Card Type:  American Card");
                break;
            }
        }
        System.out.println("**Credit Card Number: " + userCreditDetails);
        System.out.println("**Credit Card  Digit Length: " + userCreditDetails.length());
    }

    public static String firstAnd_SecondIndex(String userCreditDetails) {
        String holdFirstIndex = String.valueOf(userCreditDetails.charAt(0));
        String holdSecondIndex = String.valueOf(userCreditDetails.charAt(1));
        return holdFirstIndex + holdSecondIndex;
    }

    public static void collectInputIndividually(String userCreditDetails) {
        String individualIndex = "";
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
        finalCalculation(userCreditDetails, sumAllNumbers);

    }

    public static void finalCalculation(String userCreditDetails, int sumAllNumbers) {
        int sumNumber = 0;
        for (int thirdIndex = userCreditDetails.length() -1; thirdIndex > 0; thirdIndex -= 2) {
            char getOdd = userCreditDetails.charAt(thirdIndex);
            String holdNumber = String.valueOf(getOdd);
            sumNumber += Integer.parseInt(holdNumber);
        }
        int sumBoth_Number = sumAllNumbers + sumNumber;
        if(sumBoth_Number %  10 == 0) System.out.println("**Credit Card Validity Status : Valid");
        else System.out.println("**Credit Card Validity Status : Invalid");
    }
}
