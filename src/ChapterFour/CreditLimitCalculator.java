package ChapterFour;
import java.util.Scanner;
public class CreditLimitCalculator {
    public static void main(String [] args){
        Scanner keyboard = new Scanner (System.in);
//        int userAccountNumber, userBeginningBalance, userItemCharge, userCreditApplied, newBalance, minLoop = 0;
//
//            System.out.print("Enter Account number: ");
//            userAccountNumber = keyboard.nextInt();
//            while (userAccountNumber <= 0){
//                System.out.print("Enter Correct Account number: ");
//                userAccountNumber = keyboard.nextInt();
//                minLoop++;
//            }
//            System.out.print("Enter Beginning balance: ");
//            userBeginningBalance = keyboard.nextInt();
//            System.out.print("Enter Items Charge: ");
//            userItemCharge = keyboard.nextInt();
//            System.out.print("Enter Credit Applied: ");
//            userCreditApplied = keyboard.nextInt();
//            newBalance =  userBeginningBalance + userItemCharge - userCreditApplied;
//            System.out.println( "Your new balance is: " + newBalance + "\n");
//            if (newBalance <= 0) System.out.println("Dear Customer, Credit Limit Exceeded");
//            else System.out.println("Dear Customer, Credit Limit Not Exceeded. Thank you.");

    }
    private int userAccountNumber;
    private int userBeginningBalance;
    private int userItemCharge;
    private int userCreditApplied;
    private int userNewBalance;
    private int userInitialBalance;
    public void setUserBeginningBalance( int userBeginningBalance) {
        if (userBeginningBalance <= 0) this.userBeginningBalance = 0;
        else this.userBeginningBalance = userBeginningBalance;
    }

    public int getUserBeginningBalance() {
        return userBeginningBalance;
    }

    public void setUserItemCharge(int userItemCharge) {
        if (userItemCharge <= 0) this.userItemCharge = 0;
        else this.userItemCharge = userItemCharge;
    }

    public int getUserItemCharge() {return userItemCharge;}

    public void setUserCreditApplied(int userCreditApplied) {
        if (userCreditApplied <= 0) this.userCreditApplied = 0;
        else this.userCreditApplied = userCreditApplied;
    }

    public int getUserCreditApplied() { return userCreditApplied;}

    public void setUserNewBalance(int userBeginningBalance, int userItemCharge, int userCreditApplied) {
        if (userBeginningBalance <= 0) this.userBeginningBalance = 0;
        else if (userItemCharge <= 0) this.userItemCharge = 0;
        else if (userCreditApplied <= 0) this.userCreditApplied = 0;
        else userNewBalance = userBeginningBalance + userItemCharge - userCreditApplied;


    }

    public int getNewBalance() {
        return userNewBalance;
    }
}
