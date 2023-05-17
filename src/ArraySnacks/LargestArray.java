package ArraySnacks;

import java.util.Arrays;
import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arrayHolder = new int[5];
//        int largestNumberInArray = 0, min = 0;
//        for (int index = 0; index < arrayHolder.length; index++) {
//            System.out.print("Enter a number: ");
//            int userNumber = input.nextInt();
//            arrayHolder[index] = userNumber;
//            if(userNumber > largestNumberInArray){
//                largestNumberInArray = userNumber;
//            }
//        }
//        System.out.println(Arrays.toString(arrayHolder));
//        System.out.println("The largest of number in array is: " +largestNumberInArray);
    }

    public int setLargestNumber(int[] arrays) {
        int largestNumber = arrays[0];
        for (int index = 0; index < arrays.length; index++) {
          if(arrays[index] > largestNumber){
              largestNumber = arrays[index];
          }
        }
        return largestNumber;
    }
}
