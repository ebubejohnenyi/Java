package JavaExercise;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int userNumber;

        System.out.print("Enter to a number: ");
        userNumber = keyboard.nextInt();

        if(isPrime(userNumber)) System.out.println("This is a prime number");
        else System.out.print("This is not a prime number");
        }

    public static boolean isPrime(int userNumber){
    if(userNumber <= 1) System.out.println("Invalid");
    for(int minLoop = 2; minLoop <= userNumber /2; minLoop ++){
        if ((userNumber % minLoop) == 0)return false;
    }
    return true;
    }

   }
