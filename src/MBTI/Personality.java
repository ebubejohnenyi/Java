package MBTI;

import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Personality {
    public static void main(String[] args) {
        userInput();
    }
    static Scanner input = new Scanner(System.in);
    private static String userName;
    public static void userInput(){
        String userInput;
        System.out.println("Enter your name: ");
        userName = input.nextLine();
        System.out.println("Hello! " + userName + ", you're about to take the M.B.T.I personality test.");
        System.out.println("Press --> A or B to start");
        userInput = input.nextLine().toLowerCase();
        switch (userInput) {
            case "a", "b" -> userFirthQuestion();
            default -> System.out.println("Sorry, you entered an incorrect option.");
        }
    }
    public static void userFirthQuestion(){
            String userFirst;
            System.out.println(" ");
            System.out.println("AT A PARTY DO YOU: ");
            System.out.println("A -->  Interact with many, including strangers.");
            System.out.println("B -->  Interact with few known to you.");
            userFirst = input.nextLine().toLowerCase();
        switch (userFirst) {
            case "a", "b" -> userSecondQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userFirthQuestion();
            }
        }
    }
    public  static void userSecondQuestion(){
        System.out.println(" ");
        System.out.println("ARE YOU MORE: ");
        System.out.println("A --> Realistic than speculative.");
        System.out.println("B --> Speculative tha realistic");
        String userSecond = input.nextLine().toLowerCase();
        switch (userSecond) {
            case "a", "b" -> userThirdQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userSecondQuestion();
            }
        }
    }
    public static void userThirdQuestion(){
        System.out.println(" ");
        System.out.println("ARE YOU IMPRESSED BY: ");
        System.out.println("A --> Principles");
        System.out.println("B --> Emotions");
        String userThird = input.nextLine().toLowerCase();
        switch (userThird) {
            case "a", "b" -> userFourthQuestions();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userThirdQuestion();
            }
        }
    }
    public static void userFourthQuestions(){
        System.out.println(" ");
        System.out.println("DOES IT BOTHER YOU MORE HAVING THINGS: ");
        System.out.println("A --> Incomplete");
        System.out.println("B --> Completed");
        String userThird = input.nextLine().toLowerCase();
        switch (userThird) {
            case "a", "b" -> userFifthQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userFourthQuestions();
            }
        }
    }
    public static void userFifthQuestion(){
        System.out.println(" ");
        System.out.println("IN DOING ORDINARY THINGS ARE YOU MORE LIKELY TO: ");
        System.out.println("A --> Do it the usual way.");
        System.out.println("B --> Do it your own way.");
        String userFifth = input.nextLine().toLowerCase();
        switch (userFifth) {
            case "a", "b" -> userSixthQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userFifthQuestion();
            }
        }
    }
    public static void userSixthQuestion(){
        System.out.println(" ");
        System.out.println("ARE YOU MORE COMFORTABLE IN MAKING:");
        System.out.println("A --> Logical judgment");
        System.out.println("B --> Value judgment");
        String userSixth =  input.nextLine().toLowerCase();
        switch (userSixth) {
            case "a", "b" -> userSeventhQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userSixthQuestion();
            }
        }
    }
    public static void userSeventhQuestion(){
        System.out.println(" ");
        System.out.println("WOULD YOU SAY YOU'RE MORE: ");
        System.out.println("A --> Serious and determind");
        System.out.println("B --> Easy-going");
        String userSeventh = input.nextLine().toLowerCase();
        switch (userSeventh) {
            case "a", "b" -> userEightQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userSeventhQuestion();
            }
        }
    }
    public static void userEightQuestion(){
        System.out.println(" ");
        System.out.println("ARE YOU MORE OFTEN : ");
        System.out.println("A --> A cool headed person");
        System.out.println("B --> Warm hearted person");
        String userEight = input.nextLine().toLowerCase();
        switch (userEight) {
            case "a", "b" -> userNinthQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userEightQuestion();
            }
        }
    }
    public static void userNinthQuestion(){
        System.out.println(" ");
        System.out.println("ARE YOU INTERESTED IN: ");
        System.out.println("A --> What is actual");
        System.out.println("B --> What is possible");
        String userNinth = input.nextLine().toLowerCase();
        switch (userNinth) {
            case "a", "b" -> userTenthQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userNinthQuestion();
            }
        }
    }
    public static void userTenthQuestion(){
        System.out.println(" ");
        System.out.println("DO YOU INTEND TO LOOK FOR: ");
        System.out.println("A --> The orderly.");
        System.out.println("B --> What ever turns");
        String userTenth = input.nextLine().toLowerCase();
        switch (userTenth) {
            case "a", "b" -> userEleventhQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userTenthQuestion();
            }
        }
    }
    public static void userEleventhQuestion(){
        System.out.println(" ");
        System.out.println("DO YOU PREFER: ");
        System.out.println("A --> Many friends with bried contact.");
        System.out.println("B --> A few friends with more length contact");
        String userEleventh = input.nextLine();
        switch (userEleventh) {
            case "a", "b" -> userTwelveQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userEleventhQuestion();
            }
        }
    }

    public static void userTwelveQuestion(){
        System.out.println(" ");
        System.out.println("ARE YOU MORE COMFORTABLE:");
        System.out.println("A --> After a decision");
        System.out.println("B --> Before a decision");
        String userTwelve = input.nextLine();
        switch (userTwelve) {
            case "a", "b" -> userThirteenQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userTwelveQuestion();
            }
        }
    }

    public static void userThirteenQuestion(){
        System.out.println(" ");
        System.out.println("ARE YOU MORE LIKELY TO TRUST YOUR: ");
        System.out.println("A --> Experience");
        System.out.println("B --> Hunch");
        String userThirteen = input.nextLine();
        switch (userThirteen) {
            case "a", "b" -> userFouTeenQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userThirteenQuestion();
            }
        }
    }
    public static void userFouTeenQuestion(){
        System.out.println(" ");
        System.out.println("ARE YOU MORE LIKELY TO:");
        System.out.println("A --> See how others are useful");
        System.out.println("B --> See how other see");
        String userFourTeen = input.nextLine();
        switch (userFourTeen) {
            case "a", "b" -> userFifteenQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userFouTeenQuestion();
            }
        }
    }

    public static void userFifteenQuestion(){
        System.out.println(" ");
        System.out.println("DO YOU TEND TO BE MORE: ");
        System.out.println("A --> Deliberate and spontaneous");
        System.out.println("B --> Spontaneous than deliberate");
        String userFifteen = input.nextLine();
        switch (userFifteen) {
            case "a", "b" -> userSixteenQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userFifteenQuestion();
            }
        }
    }
    public static void userSixteenQuestion(){
        System.out.println(" ");
        System.out.println("DO YOU PREFER THE: ");
        System.out.println("A --> Planned event");
        System.out.println("B --> Unplanned event");
        String userSixteen = input.nextLine();
        switch (userSixteen) {
            case "a", "b" -> userSeventeenQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userSixteenQuestion();
            }
        }
    }
    public static void userSeventeenQuestion(){
        System.out.println(" ");
        System.out.println("ARE YOU MORE INCLINE TO BE: ");
        System.out.println("A --> Easy to approach");
        System.out.println("B --> Somewhat reserved");
        String userSeventh = input.nextLine();
        switch (userSeventh) {
            case "a", "b" -> userEighteenQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userSeventeenQuestion();
            }
        }
    }
    public static void userEighteenQuestion(){
        System.out.println(" ");
        System.out.println("ARE YOU INCLINED MORE TO BE: ");
        System.out.println("A --> Fair minded");
        System.out.println("B --> Sympathetic");
        String userEighteen = input.nextLine();
        switch (userEighteen) {
            case "a", "b" -> userNineteenQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userEighteenQuestion();
            }
        }
    }
    public static void userNineteenQuestion(){
        System.out.println(" ");
        System.out.println("DO YOU PREFER: ");
        System.out.println("A -->  Make sure things are arranged");
        System.out.println("B -->  Just let things happen");
        String userNineteen = input.nextLine();
        switch (userNineteen) {
            case "a", "b" -> userTwentyQuestion();
            default -> {
                System.out.println("Expected A or B as a response, I know this is an error. Please try again: ");
                userNineteenQuestion();
            }
        }
    }
    public static void userTwentyQuestion(){
        System.out.println(" ");
        System.out.println("IN A RELATIONSHIP, DO YOU PREFER: ");
        System.out.println("A --> Love and Respect");
        System.out.println("B --> Respect than Love");
        String userTwenty = input.nextLine();
        switch (userTwenty) {
            case "a", "b" -> {
                System.out.println("Thank you," + userName + " for your time.");
            }
            default -> userTwentyQuestion();
        }
    }

}
