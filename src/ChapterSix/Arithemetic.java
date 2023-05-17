package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Arithemetic {
   enum location{
       NORTH,
       SOUTH,
       WEST,
       EAST;
   }
      public static void main(String[] args){
       Scanner input =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
          SecureRandom random = new SecureRandom();
          int computerNumber = random.nextInt(10);
          if(userInput > computerNumber){
              System.out.println("WON");
          }
          else System.out.println("LOSS");
    }
}
