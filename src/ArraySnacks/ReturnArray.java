package ArraySnacks;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnArray {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int [] arrayHolder = new int[4];
//        for (int index = 0; index < arrayHolder.length; index++) {
//            System.out.print("Enter a number: ");
//            int userNumber = input.nextInt();
//            arrayHolder[index] = userNumber;
//        }
//        System.out.println("The number has been return in an array: "+Arrays.toString(arrayHolder));
//    }


    private  int [] inArrayForm;
    public void setReturnArray(int [] numbers) {
        inArrayForm = new int[numbers.length];
        for (int index = 0; index < numbers.length; index++) {
            if(numbers[index] <= 0){
                numbers.equals(0);
            }
            else {
                inArrayForm[index] = numbers[index];
            }
        }
    }

    public int[] getInArrayForm() {
        return inArrayForm;
    }
}
