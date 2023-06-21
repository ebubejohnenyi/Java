package PhoneBook;

import java.util.Scanner;

public class Main {
    private static Scanner keyBoardInput = new Scanner(System.in);
    private static PhoneBook phoneBook = new PhoneBook();
    public static void main(String[] args) {
        firstBlock();
    }

    private static void firstBlock() {
        System.out.println("""
                ======================
                ===== PHONE-BOOK =====
             
                = 1. QUICK SEARCH   =
                = 2. ADD NUMBER     =
                = 3. DELETE         =
                = 4. ALL CONTACT    =
                = 5. DELETE ALL     =
                =====================""");
        String userOption;
        System.out.print("ENTER HERE: "); userOption = keyBoardInput.next();
        System.out.println("");
        switch (userOption){
            case "1": quickSearch();
            break;
            case "2": addNumber();
            break;
            case "3": deleteNumber();
            break;
            case "4": viewAllContact();
            break;
            case "5": deleteAll();
            break;
            default: firstBlock();
            break;
        }
    }
    private static void quickSearch() {
        System.out.println("===== SEARCH =====");
        System.out.println("ENTER CONTACT NAME: ");
        String searchContact = keyBoardInput.next().toUpperCase();
        String contact = phoneBook.searchBy(searchContact);
        System.out.println("");
        System.out.println(searchContact +"\n"+contact);
        messageAfterBlock();
    }

    private static void messageAfterBlock() {
        System.out.println("\nPRESS ANY-KEY TO GO TO MAIN-MENU");
        String mainButton = keyBoardInput.next();
        switch (mainButton){
            default: firstBlock();
                break;
        }
    }

    private static void addNumber() {
        System.out.println("===== ADD NEW-CONTACT =====");
        System.out.println("ENTER NAME: ");
        String contactName = keyBoardInput.next().toUpperCase();
        System.out.println("ENTER PHONE-NUMBER: ");
        String contactPhoneNumber = keyBoardInput.next();
        phoneBook.add(contactName,contactPhoneNumber);
        System.out.println("SUCCESSFULLY ADDED "+ contactPhoneNumber +", TO YOUR PHONE-BOOK. \n");
        System.out.println("PRESS ANY-KEY TO GO TO MAIN-MENU");
        String mainButton = keyBoardInput.next();
        switch (mainButton){
            default: firstBlock();
            break;
        }
    }

    private static void deleteNumber() {
        System.out.println("ENTER NAME TO DELETE: ");
        String name = keyBoardInput.next();
        phoneBook.deleteContact(name);
        System.out.println("YOU'VE DELETED " + name +", FROM CONTACT.");
        messageAfterBlock();
    }

    private static void viewAllContact() {
        System.out.println("===== CONTACTS =====");
        phoneBook.viewAllAddedContact();
        messageAfterBlock();
    }
    private static void deleteAll() {
        System.out.println("WOULD YOU LIKE TO DELETE ALL CONTACT ?: (YES / NO) ");
        String answer = keyBoardInput.next().toUpperCase();
        switch (answer){
            case "YES": deletePrompt();
            break;
            case "NO": messageAfterBlock();
            break;
            default: deleteAll();
        }

    }
    private static void deletePrompt() {
        phoneBook.deleteAll();
        System.out.println("ALL CONTACT HAVE SUCCESSFULLY BEEN DELETED");
        messageAfterBlock();
    }
}
