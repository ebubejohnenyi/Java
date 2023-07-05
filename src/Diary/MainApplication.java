package Diary;

import java.util.Scanner;

public class MainApplication {
    private static Scanner input = new Scanner(System.in);
    private static String userName, userPassword, userGistTitle, userGistBody;
    private static int gistId;
    private static Diary diary = new Diary(userName,userPassword);
    public static void main(String[] args) {
        firstDisplay();
    }

    private static void firstDisplay() {
        System.out.println("""
                1. CREATE DAIRY
                2. EXIST""");
        String userFirstDisplay = input.nextLine();
        switch (userFirstDisplay){
            case "1": createDairy();
            break;
            case "2": exist();
            break;
            default:
                System.out.println("ENTER CORRECT CHOICE");
        }
    }

    private static void createDairy() {
        System.out.println("ENTER USERNAME: ");
        userName = input.nextLine().toUpperCase();
        System.out.println("CREATE PASSWORD: ");
        userPassword = input.nextLine();
        if(userPassword.length() > 4){
            throwErrorMessage();
        }
        mainMenu();
    }

    private static void throwErrorMessage() {
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException ex){
            System.out.println("DEAR " + userName +", KINDLY ENTER 4 DIGITS PASSWORD");
            createDairy();
        }
    }

    private static void mainMenu() {
        System.out.println("""
                1. CREATE NEW GIST
                2. DELETE GIST
                3. FIND GIST
                4. UPDATE GIST
                5. DELETE ALL GIST""");
        String userOption = input.nextLine();
        prompt(userOption);
    }

    private static void prompt(String userOption) {
        switch (userOption){
            case "1": createGist();
            break;
            case "2": deleteGist();
            break;
            case "3": findGist();
            break;
            case "4": updateGist();
            break;
            case "5": deleteAll();
            break;
            default:
                System.out.println("ENTER A CORRECT OPTION.");
        }
    }

    private static void createGist() {
        System.out.println("ENTER GIST TITLE: ");
        userGistTitle = input.nextLine();
        System.out.println("ENTER GIST BODY: ");
        userGistBody = input.nextLine();
        diary.createNewGist(userGistTitle,userGistBody);
        System.out.println("GIST CREATED SUCCESSFULLY. \n");
        popBack_Message();
    }

    private static void deleteGist() {
        System.out.println("ENTER GIST TITLE: ");
        String userGist_toDelete = input.nextLine();
        find(userGist_toDelete);
    }

    private static void find(String userGist_toDelete) {
        if(userGist_toDelete.equalsIgnoreCase(userGistTitle)){
            diary.deleteGist_ByTitle(userGist_toDelete);
            System.out.println("GIST DELETED SUCCESSFULLY \n");
        }
        else {
            System.out.println("GIST DOESN'T EXIST");
            popBack_Message();
        }
    }

    private static void findGist() {
        System.out.println("ENTER GIST TITLE: ");
        String userFind_GistTitle = input.nextLine();
        System.out.println(diary.findMy_gist_ByTitle(userFind_GistTitle));
        popBack_Message();
    }

    private static void updateGist() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ENTER PASSWORD");
        String pin = input.nextLine();
        if(pin.equals(userPassword)){
            System.out.println("ENTER ID: ");
            gistId = input.nextInt();
            System.out.println("ENTER GIST TITLE: ");
            String userGistUpdateTitle = keyboard.nextLine();
            System.out.println("ENTER GIST BODY: ");
            String userGistUpdateBody = input.nextLine();
            diary.updateEntry(gistId,userGistUpdateTitle,userGistUpdateBody);
            System.out.println("GIST UPDATED SUCCESSFULLY. \n");
            popBack_Message();
        }
        else {
            System.out.println("INCORRECT PIN");
            updateGist();
        }
    }

    private static void deleteAll() {
    }

    private static void popBack_Message() {
        System.out.println();
        System.out.println("""
                1 -> MainMenu
                2 -> Exist""");
        String message = input.nextLine();
        promptEnd(message);
    }

    private static void promptEnd(String endMessageChoice) {
        switch (endMessageChoice){
            case "1": mainMenu();
            break;
            case "2": exist();
            break;
            default: popBack_Message();
            break;
        }
    }

    private static void exist() {
        System.exit(1);
    }

}
