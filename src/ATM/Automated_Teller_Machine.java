package ATM;

import Bicycle.Brakes;

import java.util.Objects;
import java.util.Scanner;

public class Automated_Teller_Machine {
    private static String userPin;
    private static double accountBalance;
    static Scanner keyboardInput =  new Scanner(System.in);
    public static void main(String[] args) {
        display();
    }
    public static void display(){
        System.out.println("""
                WELCOME TO SNOW BANK LTD
                PLEASE INSERT YOUR CARD OR PRESS ANY KEY TO PERFORM CARD-LESS TRANSACTION : """);
        String userInput = keyboardInput.next();
        switch (userInput){
            default: prompt();
            break;
        }
    }
    public static void prompt() {
        System.out.println("ENTER PIN: ");
        userPin = keyboardInput.next();
        if(userPin.length() == 4){
            firstView();
        }
        else {
            System.out.println("DEAR CUSTOMER YOU ENTERED INCORRECT PIN");
        }
    }
    public static void firstView(){
        System.out.println("""
                1. WITHDRAWAL
                2. TRANSFER
                3. CHANGE PIN
                4. BALANCE
                5. PAYARENA""");
        String userChoice = keyboardInput.next();
        optionsFor(userChoice);
    }
    public static void optionsFor(String userChoice) {
        switch (userChoice){
            case "1": withdrawal();
                break;
            case "2": transfer();
                break;
            case "3": changePin();
                break;
            case "4": balance();
                break;
            case "5": patarena();
                break;
            default: firstView();
                break;
        }
    }
    public static void patarena() {
        System.out.println("STILL UNDER CONSTRUCTION.");
    }
    public static void balance() {
        System.out.println("""
                1. SAVINGS
                2. CURRENT
                3. CREDIT""");
        String balanceChecker = keyboardInput.next();
        promptBalance(balanceChecker);
    }

    public static void promptBalance(String message) {
        switch (message){
            case "1","2","3": promptBalanceAccountNumber();
            break;
            default: balance();
            break;
        }
    }

    public static void promptBalanceAccountNumber() {
        System.out.println("DEAR CUSTOMER YOUR BALANCE IS: ");
        System.out.println(accountBalance);
    }

//        public static void receiptDisclaimer() {
//        System.out.println("""
//                DO YOU WANT RECEIPT FOR THIS TRANSACTION?
//                1. YES
//                2. NO""");
//        String yes_no = keyboardInput.next();
//        switch (yes_no){
//            case "1","2": amountForWithdrawal();
//            break;
//            default: receiptDisclaimer();
//            break;
//        }
//    }
    public static void changePin() {
        System.out.println("ENTER CURRENT PIN: ");
        String userOldPin = keyboardInput.next();
        System.out.println("ENTER NEW PIN: ");
        String userNewPin = keyboardInput.next();
        if(!Objects.equals(userOldPin, userNewPin)){
            userPin += userNewPin;
        }
        else {
            System.out.println("YOU ENTERED SAME PIN");
        }

    }

    public static void transfer() {
        System.out.println("KINDLY ENTER THE DESTINATION ACCOUNT NUMBER: ");
        String accountToTransfer = keyboardInput.next();
        if(accountToTransfer.length() == 10){
            System.out.println("ENTER AMOUNT YOU WANT TO TRANSFER");
            double amountToTransfer = keyboardInput.nextDouble();
            if(amountToTransfer > accountBalance){
                System.out.println("INSUFFICIENT FUNDS");
            }
            else{
                accountBalance -= amountToTransfer;
            }
        }
        else {
            System.out.println("INCORRECT ACCOUNT NUMBER.");
        }
    }
    public static void withdrawal() {
        System.out.println("""
                1. CURRENT
                2. SAVING
                3. CREDIT""");
        String typeOfAccount = keyboardInput.next();
        switch (typeOfAccount){
            case "1", "2", "3": amountForWithdrawal();
            break;
            default: withdrawal();
            break;
        }
    }
    public static void amountForWithdrawal() {
        System.out.println("""
                1. 1000
                2. 5000
                3. 10,000
                4. 20,000
                5  OTHERS
                6 PRESS ANY KEY TO TERMINATE TRANSACTION""");
        String withdrawalAmount = keyboardInput.next();
        switch (withdrawalAmount){
            case "5": customerAmountChoice();
            break;
            case "6": {
                System.out.println("THANK YOU FOR BANKING WITH SNOW BANK LTD");
                break;
            }
            default: amountForWithdrawal();
            break;
        }
    }
    public static void customerAmountChoice() {
        System.out.println("ENTER CHOICE OF AMOUNT: ");
        double userWithdrawalAmount = keyboardInput.nextDouble();
        if(userWithdrawalAmount > accountBalance){
            System.out.println("INSUFFICIENT FUNDS");
        }
        else {
            accountBalance -= userWithdrawalAmount;
        }
    }
//    public static String inputSection(String enter){
//        return keyboardInput.next();
//    }
}
