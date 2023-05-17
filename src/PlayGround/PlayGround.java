package PlayGround;

import java.util.Arrays;
import java.util.Scanner;

public class PlayGround {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        try {
//            int [] numbers = { 2, 3, 4, 5, 6};
//            System.out.print(numbers[10]);
//        }
//        catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println(ex);
//        }

//        int[] number = {1, 2, 3, 4, 5};
//        modify(number);
//        System.out.println(Arrays.toString(number));
//
//        int minNumber = -1, oppositeInput = 0, negativeVal,positiveVal;
//        System.out.print("Enter a positive / negative number: ");
//        int userInput = input.nextInt();


//        if (userInput <= 0){
//            oppositeInput = userInput;
//            System.out.println("The positive number is: " + oppositeInput);
//        }
//        else if (userInput > 0 ){
//            oppositeInput = minNumber * userInput;
//            System.out.println("The oppposite is: "+ oppositeInput);
//        }


//        negativeVal = (~(userInput - 1));
//        System.out.println("The number turned to a negative number: " + negativeVal);
//        System.out.println("Enter a negative number: ");
//        int userInput2 = input.nextInt();
//        positiveVal = ~(userInput2 - 1);
//        System.out.println("The number to positive is: " + positiveVal);

       int [][] arr = new int[5][5];
       arr [0] = new int[5];
       arr [1] = new int[4];
       arr [2] = new int[3];
       arr [3] = new int[2];
       arr [4] = new int[3];

       for (int index = 0; index < 5; index++) {
           for (int secondIndex = 0; secondIndex < arr[index].length; secondIndex++) {
                arr[index][secondIndex] = secondIndex;
           }
        }
        System.out.print(Arrays.deepToString(arr));



//        int [] firstRow = arr[0];
//        for (int index = 0; index < firstRow.length; index++) {
//            myMethod(firstRow, index);
//        }
//        System.out.println(Arrays.deepToString(arr));

    }

//    private static void myMethod(int[] firstRow, int index) {
//        firstRow[index] =index;
//    }

}

//    public static void modify(int [] arr) {
//        for (int index = 0; index < arr.length; index++) {
//            arr[index] = arr[index] * arr[index];
//        }
//        System.out.println(" From the method: " + Arrays.toString(arr));
//    }


