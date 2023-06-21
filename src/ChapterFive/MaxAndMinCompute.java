package ChapterFive;

import java.util.Scanner;

public class MaxAndMinCompute {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int sum = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for (int index = 0; index < 5; index++) {
            System.out.println("Enter a number: ");
            int userInput = keyboardInput.nextInt();
            if(userInput > max && userInput > min){
                max = userInput;
            }
            else if (userInput > min && userInput < max) {
                min = userInput;
            }
        }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: "+ min);
        sum += min+max;
        System.out.println("The sum is: " + sum);
    }

    public void maxAndMin() {

    }
}
