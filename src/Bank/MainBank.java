package Bank;

import java.util.Scanner;

public class MainBank {
    static Scanner keyBoardInput = new Scanner(System.in);
    private static Bank bank = new Bank();
    private static String userFirstName, userLastName, accountNumber, userPhoneNumber, senderAccountNumber,receiverAccountNumber;
    private static int amountToDeposit,withdrawAmount_FromAccount, userPin, transferPin, accountBalance;
    public static void main(String[] args) {
        System.out.println("""
                ====================================
                ===== WELCOME TO SNOW BANK LTD =====
                ----- SINCE 1995.              -----
                ====================================""");
        newAccountBlock();
        mainBlock();
    }

    private static void mainBlock() {
        System.out.println("""
                1. DEPOSIT
                2. WITHDRAW
                3. TRANSFER
                4. CHECK BALANCE
                5. CHANGE PIN
                6. CHANGE PHONE-NUMBER
                7. CLOSE ACCOUNT""");
        String mainChoice = keyBoardInput.next();
        switch(mainChoice){
            case "1": depositTo();
            break;
            case "2": withdrawFrom();
            break;
            case "3": transferTo();
            break;
            case "4": checkBalance();
            break;
            case "5": changeUserPin();
            break;
            case "6": changePhoneNumber();
            break;
            case "7": closeAccount();
            break;
        }
    }

    private static void depositTo() {
        System.out.println("ENTER ACCOUNT NUMBER: ");
        String depositToAccount = keyBoardInput.next();
        System.out.println("ENTER AMOUNT TO DEPOSIT: ");
        checkErrorsFor(depositToAccount);
        messageAfter(depositToAccount);
    }

    private static void checkErrorsFor(String depositToAccount) {
        try {
            amountToDeposit = keyBoardInput.nextInt();
            bank.deposit(depositToAccount, amountToDeposit);
        }catch (IllegalArgumentException ex){
            System.out.println("INVALID AMOUNT");
            System.exit(1);
        }
    }

    private static void messageAfter(String depositToAccount) {
        System.out.println("DEAR " + userFirstName +" "+ userLastName + ", YOU'VE SUCCESSFULLY DEPOSITED INTO "+ depositToAccount +"." +
                "THANK YOU FOR BANKING WITH SNOW BANK LTD.\n");
        System.out.println("PRESS ANY KEY, GO TO MAIN-MENU");
        String buttonForMain = keyBoardInput.next();
        switch (buttonForMain){
            default: mainBlock();
            break;
        }
    }

    private static void withdrawFrom() {
        System.out.println("ENTER ACCOUNT NUMBER: ");
        String withdrawFromAccount = keyBoardInput.next();
        System.out.println("ENTER PIN: ");
        int withdrawalPin = keyBoardInput.nextInt();
        validateUser(withdrawalPin);
        checkErrorsFor(withdrawFromAccount, withdrawalPin);
        messageAfter(withdrawAmount_FromAccount);
        System.out.println("PRESS ANY KEY, GO TO MAIN-MENU");
        String buttonForMain = keyBoardInput.next();
        switch (buttonForMain){
            default: mainBlock();
                break;
        }
    }

    private static void validateUser(int withdrawalPin) {
        if(String.valueOf(withdrawalPin).equals(String.valueOf(userPin))){
            System.out.println("ENTER AMOUNT: ");
        }
        else {
            System.out.println("INCORRECT PIN, TRY AGAIN.! \n");
            withdrawFrom();
        }
    }

    private static void checkErrorsFor(String withdrawFromAccount, int withdrawalPin) {
            try {
                withdrawAmount_FromAccount = keyBoardInput.nextInt();
                bank.withdraw(withdrawFromAccount, String.valueOf(withdrawalPin), withdrawAmount_FromAccount);
            }catch (IllegalArgumentException ex){
                System.out.println("INSUFFICIENT FUNDS");
                System.exit(1);
            }
    }

    private static void messageAfter(int withdrawAmountFromAccount) {
        System.out.println("DEAR "+ userFirstName +" "+ userLastName +", YOU'VE SUCCESSFULLY WITHDRAWN "+ withdrawAmountFromAccount + " FROM "+ accountNumber+"" +
                "THANK YOU FOR BANKING WITH SNOW BANK LTD. \n");
    }

    private static void transferTo() {
        System.out.println("ENTER SENDER ACCOUNT NUMBER: ");
        senderAccountNumber = keyBoardInput.next();
        validateSender_AccountNumber();
        System.out.println("ENTER AMOUNT: ");
        int transferAmount = keyBoardInput.nextInt();
        validateFor(transferAmount);
        validate(transferAmount, transferPin);
        messageAfterTransfer();
        System.out.println("PRESS ANY KEY, GO TO MAIN-MENU");
        String buttonForMain = keyBoardInput.next();
        switch (buttonForMain){
            default: mainBlock();
                break;
        }
    }

    private static void validateFor(int transferAmount) {
        if(transferAmount < 0){
            System.out.println("INVALID AMOUNT. TRY AGAIN.! \n");
            transferTo();
        }
        else{
            System.out.println("ENTER PIN: ");
            transferPin = keyBoardInput.nextInt();
        }
    }
    private static void validate(int transferAmount, int transferPin) {
        if(String.valueOf(transferPin).equals(String.valueOf(userPin))){
            bank.transferTo(senderAccountNumber,receiverAccountNumber, transferAmount,String.valueOf(transferPin));
        }
        else {
            System.out.println("INCORRECT PIN. TRY AGAIN.!\n");
            transferTo();
        }
    }

    private static void validateSender_AccountNumber() {
        if(senderAccountNumber.equals(accountNumber)){
            System.out.println("ENTER RECEIVER ACCOUNT NUMBER: ");
            receiverAccountNumber = keyBoardInput.next();
        }
        else {
            System.out.println("SENDER ACCOUNT DOESN'T MATCH. TRY AGAIN.! \n");
            transferTo();
        }
    }

    private static void messageAfterTransfer() {
        System.out.println("DEAR "+ userFirstName +" "+ userLastName +", YOUR TRANSFER TO "+ receiverAccountNumber + " IS SUCCESSFUL. THANK YOU FOR BANKING WITH SNOW BANK LTD. \n");
    }

    private static void checkBalance() {
        System.out.println("ENTER ACCOUNT NUMBER: ");
        String accountNumberToCheck = keyBoardInput.next();
        accountBalance = bank.getBalance(accountNumberToCheck);
        System.out.println("DEAR "+userFirstName+" "+userLastName+", YOUR ACCOUNT BALANCE IS "+accountBalance);

        System.out.println("PRESS ANY KEY, GO TO MAIN-MENU");
        String buttonForMain = keyBoardInput.next();
        switch (buttonForMain){
            default: mainBlock();
                break;
        }
    }

    private static void changeUserPin() {
        System.out.println("ENTER ACCOUNT NUMBER: ");
        String userChange_PinAccount = keyBoardInput.next();
        if(userChange_PinAccount.equals(accountNumber)){
            System.out.println("ENTER CURRENT PIN");
            int userCurrentPin = keyBoardInput.nextInt();
            if(userCurrentPin == userPin){
                System.out.println("ENTER NEW PIN");
                int userNewPin = keyBoardInput.nextInt();
                if(userNewPin == userCurrentPin){
                    System.out.println("YOU'VE ENTERED SAME PIN. TRY AGAIN.!");
                    changeUserPin();
                }
                else{
                    userPin = userNewPin;
                    System.out.println("PIN CHANGED SUCCESSFULLY");
                }
            }
            else{
                System.out.println("PIN DOESN'T MATCH.");
            }
        }
        else System.out.println("ACCOUNT DOESN'T EXIST. TRY AGAIN");
        System.out.println("");
        System.out.println("PRESS ANY KEY, GO TO MAIN-MENU");
        String buttonForMain = keyBoardInput.next();
        switch (buttonForMain){
            default: mainBlock();
                break;
        }
    }

    private static void changePhoneNumber() {
        System.out.println("ENTER ACCOUNT NUMBER: ");
        String userChange_PinAccount = keyBoardInput.next();
        if(userChange_PinAccount.equals(accountNumber)){
            System.out.println("ENTER CURRENT PHONE-NUMBER");
            String userCurrentPhoneNumber = keyBoardInput.next();
            if(userCurrentPhoneNumber.equals(userPhoneNumber)){
                System.out.println("ENTER NEW PHONE-NUMBER");
                String userNewPhoneNumber = keyBoardInput.next();
                if(userNewPhoneNumber.equals(userCurrentPhoneNumber)){
                    System.out.println("YOU'VE ENTERED SAME PHONE-NUMBER. TRY AGAIN.!");
                    changePhoneNumber();
                }
                else{
                    userPhoneNumber = userNewPhoneNumber;
                    System.out.println("DEAR CUSTOMER, YOUR PHONE-NUMBER CHANGED SUCCESSFULLY");
                }
            }
            else{
                System.out.println("PHONE-NUMBER DOESN'T MATCH.");
            }
        }
        else System.out.println("ACCOUNT DOESN'T EXIST. TRY AGAIN");
        System.out.println("");
        System.out.println("PRESS ANY KEY, GO TO MAIN-MENU");
        String buttonForMain = keyBoardInput.next();
        switch (buttonForMain){
            default: mainBlock();
                break;
        }
    }

    private static void closeAccount() {
        System.out.println("ENTER ACCOUNT NUMBER: ");
        String userAccountToDelete = keyBoardInput.next();
        if(userAccountToDelete.equals(accountNumber)){
            System.out.println("ENTER PIN: ");
            int userPin_ToDeleteAccount = keyBoardInput.nextInt();
            if(userPin_ToDeleteAccount==userPin){
                bank.deleteAccountNumber(userAccountToDelete);
                System.out.println("THANK YOU FOR BANKING WITH SNOW BANK.");
                System.exit(1);
            }
            else System.out.println("INCORRECT PIN. TRY AGAIN.");
        }
        else System.out.println("ACCOUNT DOESN'T MATCH. TRY AGAIN.");
    }

    private static void newAccountBlock() {
        System.out.println("""
                ===== ENTER FIRST NAME =====""");
        userFirstName = keyBoardInput.next().toUpperCase();
        System.out.println("""
                ===== ENTER LAST NAME =====""");
        userLastName = keyBoardInput.next().toUpperCase();
        System.out.println("""
                ===== ENTER PHONE-NUMBER =====""");
        handleErrors_For_userPhoneNumber();
        System.out.println("""
                ===== CREATE PIN =====""");
        userPin = keyBoardInput.nextInt();
        validate(userPin);
        registerNewCustomer_With(userPhoneNumber, userPin);
    }

    private static void handleErrors_For_userPhoneNumber() {
        try {
            userPhoneNumber = keyBoardInput.next();
                generateAccountNumber_With(userPhoneNumber);
        }catch (IllegalArgumentException ex){
            System.out.println("DEAR CUSTOMER, NUMBER IS MORE 11 DIGITS, TRY AGAIN.");
            newAccountBlock();
        }
    }

    private static void validate(int userPin) {
        checkPinLength(String.valueOf(userPin));
    }
    private static void registerNewCustomer_With(String userPhoneNumber, int userPin) {
        bank.registerNewCustomer(userFirstName, userPhoneNumber,String.valueOf(userPin));
    }
    private static void generateAccountNumber_With(String userPhoneNumber) {
            accountNumber = bank.generateCustomerAccountNumberWith(userPhoneNumber);
    }
    private static void checkPinLength(String userPin) {
        if(userPin.length() > 4){
            System.out.println("DEAR CUSTOMER, DIGITS SHOULD NOT BE NEGATIVE AND KINDLY ENTER 4 DIGITS PIN.");
            newAccountBlock();
        }
        else{
            System.out.println("DEAR "+userFirstName +" "+userLastName +", ACCOUNT SUCCESSFULLY CREATED. " +
                    "\nTHIS IS YOUR ACCOUNT NUMBER " + accountNumber +", YOU CAN NOW MAKE TRANSACTION.");
        }
    }
}
