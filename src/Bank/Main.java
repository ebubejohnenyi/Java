package Bank;

import java.util.Scanner;

public class Main {
    private static final Bank bank = new Bank();
    private static int accountBalance;
    private static String userFirstName, customerAccountNumber, userLastName;
    private static final Scanner keyboardInput = new Scanner(System.in);
    private static String pin, userPhoneNumber;

    public static void main(String[] args) {
        welcomeMessage();
        mainDisplay();
    }

    public static void welcomeMessage() {
        System.out.println("""
                ========== WELCOME TO JON_SNOW BANK LTD ==========
                ===== NUMBER 1 BANK IN AFRICA, SINCE 1960. =====
                
                PRESS 1 OR 2 TO CREATE ACCOUNT: """);
        String userWelcomeMessage = keyboardInput.next();
        switch (userWelcomeMessage){
            case "1","2": createAnAccount();
            break;
            default: welcomeMessage();
            break;
        }
    }
    private static void createAnAccount() {
        System.out.println("""
                ========== ENTER FIRST NAME ==========""");
        userFirstName = keyboardInput.next().toUpperCase();
        System.out.println("""
                ========== ENTER LAST NAME ===========""");
        userLastName = keyboardInput.next().toUpperCase();
        System.out.println("""
                ========== ENTER PIN ==========""");
        int userPIN = keyboardInput.nextInt();
        validateUserPin(String.valueOf(userPIN));
        System.out.println("""
            ========== ENTER PHONE-NUMBER ==========""");
        userPhoneNumber = keyboardInput.next();
        try{
            generateCustomerAccountNumberWith(userFirstName, userLastName, String.valueOf(userPIN), userPhoneNumber);
        }catch (IllegalArgumentException ex){
            System.out.println("DEAR CUSTOMER, NUMBER CANNOT BE CONVERTED. ENTER 11 DIGITS NUMBER");
            System.exit(1);
        }
    }

    private static void validateUserPin(String userPIN) {
        if(userPIN.length() > 4){
            System.out.println("DEAR CUSTOMER, YOU'VE ENTERED AN INCORRECT PIN");
            System.exit(1);
        }
    }

    private static void generateCustomerAccountNumberWith(String userFirstName, String userLastName, String userPIN, String userPhoneNumber) {
        bank.registerNewCustomer(userFirstName, userPhoneNumber, userPIN);
        String userGeneratedAccountNumber = bank.generateCustomerAccountNumberWith(userPhoneNumber);
        System.out.println("Dear "+ userFirstName +" "+ userLastName +", your account has been successfully created. Your account number is " +userGeneratedAccountNumber +". Thanks for choosing JON_SNOW BANK LTD." +
                "\n You can now Deposit, Withdraw money from your Account.");
    }
    private static void mainDisplay(){
        System.out.println("""
                1. DEPOSIT
                2. WITHDRAWAL
                3. TRANSFER
                4. CHANGE PIN
                5. CLOSE ACCOUNT
                6. CHECK BALANCE""");
        String chooseOption = keyboardInput.next();
        switch (chooseOption){
            case "1": deposit();
            break;
            case  "2": withdrawal();
            break;
            case "3": transfer();
            break;
            case "4": changePin();
            break;
            case "5": closeAccount();
            break;
            case "6": checkBalance();
            break;
            default: mainDisplay();
        }
    }
    private static void deposit(){
        System.out.println("ENTER ACCOUNT NUMBER: ");
        customerAccountNumber = keyboardInput.next();
        System.out.println("ENTER AMOUNT TO DEPOSIT: ");
        int amount = keyboardInput.nextInt();
        bank.deposit(customerAccountNumber, amount);
        System.out.println("YOU'VE SUCCESSFULLY DEPOSITED INTO THIS ACCOUNT " + userFirstName +" "+userLastName+".");
        System.out.println();
        System.out.print("ENTER 1 TO GO BACK TO THE MAIN MENU: ");
        String anyKey = keyboardInput.next();
        switch (anyKey){
            case "1": mainDisplay();
            break;
            default: deposit();
            break;
        }
    }
    private static void withdrawal(){
        System.out.println("ENTER ACCOUNT NUMBER: ");
        String withdrawalAccountNumber = keyboardInput.next();
        System.out.println("ENTER ACCOUNT NUMBER: ");
        int withdrawalAmount = keyboardInput.nextInt();
        if(withdrawalAccountNumber.equals(customerAccountNumber)){
            accountBalance = bank.getBalance(withdrawalAccountNumber);
            accountBalance -= withdrawalAmount;
            System.out.println("DEAR CUSTOMER, YOUR ACCOUNT BALANCE IS "+ accountBalance);
        }
        System.out.println();
        System.out.println("ENTER 1 TO GO BACK TO THE MAIN MENU1");
        String anyKey = keyboardInput.next();
        switch (anyKey){
            case "1": mainDisplay();
                break;
            default: deposit();
                break;
        }
    }
    private static void transfer(){
        System.out.println();
        System.out.println("ENTER 1 TO GO BACK TO THE MAIN MENU2");
        String anyKey = keyboardInput.next();
        switch (anyKey){
            case "1": mainDisplay();
                break;
            default: deposit();
                break;
        }
    }
    private static void changePin(){
        System.out.println("ENTER CURRENT PIN: ");
        String currentPin = keyboardInput.next();
        System.out.println("ENTER NEW PIN: ");
        String newPin = keyboardInput.next();
        validatingPin(currentPin, newPin);
        System.out.println();
        System.out.println("ENTER 1 TO GO BACK TO THE MAIN MENU3");
        String anyKey = keyboardInput.next();
        switch (anyKey){
            case "1": mainDisplay();
                break;
            default: deposit();
                break;
        }
    }

    private static void validatingPin(String currentPin, String newPin) {
        if(currentPin.equals(newPin)){
            System.out.println("DEAR CUSTOMER YOU'VE ENTERED SAME PIN");
        }
        else {
            Main.pin = newPin;
        }
    }

    private static void closeAccount(){
        System.out.println("ENTER ACCOUNT NUMBER:");
        String deleteAccountNumber = keyboardInput.next();
        bank.deleteAccountNumber(deleteAccountNumber);
        System.out.println();
        System.out.println("ENTER 1 TO GO BACK TO THE MAIN MENU4");
        String anyKey = keyboardInput.next();
        switch (anyKey){
            case "1": mainDisplay();
                break;
            default: deposit();
                break;
        }
    }
    private static void checkBalance(){
        System.out.println("ENTER ACCOUNT NUMBER: ");
        String checkBalanceAccount = keyboardInput.next();
        if(checkBalanceAccount.equals(customerAccountNumber)){
            System.out.println("Dear "+ userFirstName+" "+ userLastName +", your Account Balance is: " + balance(checkBalanceAccount));
        }
        else {
            System.out.println("DEAR CUSTOMER, THIS ACCOUNT NUMBER DOESN'T EXIST.");
        }
        System.out.println();
        System.out.println("ENTER 1 TO GO BACK TO THE MAIN MENU");
        String anyKey = keyboardInput.next();
        switch (anyKey){
            case "1": mainDisplay();
                break;
            default: deposit();
                break;
        }
    }
    private static int balance(String checkBalanceAccount) {
        return bank.getBalance(checkBalanceAccount);
    }
}
