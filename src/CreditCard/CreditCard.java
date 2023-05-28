package CreditCard;
import java.util.Scanner;

public class CreditCard {
//    public static void main(String[] args) {
//        validatingUserCreditCard();
//    }

//    public static void validatingUserCreditCard() {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Hello, Kindly Enter Card details to verify: ");
//        String userCreditCard = scan.nextLine();
//        check_TypeOf_Card(userCreditCard);
//        collectInputIndividually(userCreditCard);
//    }
//
//    public static void check_TypeOf_Card(String userCreditDetails) {
//        String join = firstAnd_SecondIndex(userCreditDetails);
//        for (int count = 0; count < 1; count++) {
//            if (userCreditDetails.startsWith(String.valueOf(4))){
//                System.out.println("**Credit Card Type:  Visa Card");
//                break;
//            }
//            else if(userCreditDetails.startsWith(String.valueOf(5))){
//                System.out.println("**Credit Card Type:  Master Card");
//                break;
//            }
//            else if(userCreditDetails.startsWith(String.valueOf(6))){
//                System.out.println("**Credit Card Type:  Discover Card");
//                break;
//            }
//            else if (userCreditDetails.startsWith(join)){
//                System.out.println("**Credit Card Type:  American Card");
//                break;
//            }
//        }
//        System.out.println("**Credit Card Number: " + userCreditDetails);
//        System.out.println("**Credit Card  Digit Length: " + userCreditDetails.length());
//    }
//
//    public static String firstAnd_SecondIndex(String userCreditDetails) {
//        String holdFirstIndex = String.valueOf(userCreditDetails.charAt(0));
//        String holdSecondIndex = String.valueOf(userCreditDetails.charAt(1));
//        return holdFirstIndex + holdSecondIndex;
//    }
//
//    public static void collectInputIndividually(String userCreditDetails) {
//        String individualIndex = "";
//        int doubleNumber, holdIntegerIndex, sumInnerNumber = 0, sumAllNumbers = 0;
//        for (int index = 0; index < userCreditDetails.length(); index += 2) {
//            individualIndex = String.valueOf(userCreditDetails.charAt(index));
//            holdIntegerIndex = Integer.parseInt(individualIndex);
//            doubleNumber = holdIntegerIndex * 2;
//            if (doubleNumber > 9) {
//                for (int secondIndex = 0; secondIndex < 2; secondIndex++){
//                    int sumRemainder = 0, remainder;
//                    remainder = doubleNumber % 10;
//                    sumRemainder += remainder;
//                    sumInnerNumber += sumRemainder;
//                    doubleNumber /= 10;
//                }
//            }
//            sumInnerNumber += doubleNumber;
//        }
//        sumAllNumbers += sumInnerNumber;
//        finalCalculation(userCreditDetails, sumAllNumbers);
//
//    }
//
//    public static void finalCalculation(String userCreditDetails, int sumAllNumbers) {
//        int sumNumber = 0;
//        for (int thirdIndex = userCreditDetails.length() -1; thirdIndex > 0; thirdIndex -= 2) {
//            char getOdd = userCreditDetails.charAt(thirdIndex);
//            String holdNumber = String.valueOf(getOdd);
//            sumNumber += Integer.parseInt(holdNumber);
//        }
//        int sumBoth_Number = sumAllNumbers + sumNumber;
//        if(sumBoth_Number %  10 == 0) System.out.println("**Credit Card Validity Status : Valid");
//        else System.out.println("**Credit Card Validity Status : Invalid");
//    }








    private String visaCard;
    private String discoverCard;
    private String masterCard;
    private String americanCard;
    private int cardLength;
    private String userCreditCard;
    private String holder = "";
    public void checkDetails(String userCreditCard){
        userCreditCard = "4388576018410707";
        this.userCreditCard = userCreditCard;
    }

    public String getCardNumber() {
        return userCreditCard;
    }

    public void isVisa_Card(String userCreditCard) {
        String firstDigit = String.valueOf(userCreditCard.charAt(0));
        this.visaCard = firstDigit;
        if(firstDigit.equals("4")) System.out.println("This is a Visa Card");
        else System.out.println("Invalid");
    }

    public String get_VisaCard() {
        return visaCard;
    }

    public void isMaster_Card(String userCreditCard) {
        String secondDigit = String.valueOf(userCreditCard.charAt(0));
        this.masterCard = secondDigit;
        if(secondDigit.startsWith(String.valueOf(5))) System.out.println("This is a Master Card");
        else System.out.println("Invalid");
    }

    public String get_MasterCard() {
        return masterCard;
    }
    public void isDiscover_Card(String userCreditCard) {
        String thirdDigit = String.valueOf(userCreditCard.charAt(0));
        this.discoverCard = thirdDigit;
        if(thirdDigit.startsWith(String.valueOf(6))) System.out.println("This is a Discover Card");
        else System.out.println("Invalid");
    }

    public String get_DiscoverCard() {
        return discoverCard;
    }

    public void isAmerican_ExpressCard(String userCreditCard) {
        String firstIndex = String.valueOf(userCreditCard.charAt(0));
        String secondIndex = String.valueOf(userCreditCard.charAt(1));
        String americanCard = firstIndex + secondIndex;
        this.americanCard = americanCard;
        if(userCreditCard.startsWith(americanCard)) System.out.println("This is an American Express Card");
        else System.out.println("Invalid");
    }

    public String get_AmericanCard() {
        return americanCard;
    }

    public void checkCard_Length(String userCreditCard) {
        this.userCreditCard = userCreditCard;
        if(this.userCreditCard.length() < 13 || this.userCreditCard.length() > 16) {
            cardLength = Integer.parseInt(this.userCreditCard = "0");

        }
        else {
            System.out.println("The card length is: " + this.userCreditCard.length());
            cardLength = Integer.parseInt(String.valueOf(this.userCreditCard.length()));
        }
    }

    public int getLength() {
        return cardLength;
    }

    public void double_SecondDigit(String userCreditCard) {
        for (int index = 0; index < userCreditCard.length(); index += 2) {
            this.holder = String.valueOf(userCreditCard.charAt(index));
        }
    }

    public String getDouble_SecondDigit() {
        return this.holder;
    }
}
