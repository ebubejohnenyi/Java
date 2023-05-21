package ArraySnacks;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumberArray {
    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        int [] arrayHolder = new int[5];
//        for (int index = 0; index < arrayHolder.length;) {
//            System.out.print("Enter a number: ");
//            int userNumber = input.nextInt();
//            if(userNumber % 2 == 0){
//                arrayHolder[index] = userNumber;
//                if(arrayHolder[index] == 5){
//                    break;
//                }
//                else {
//                    index++;
//                }
//            }
//        }
//        System.out.println("The even number of user input is: " + Arrays.toString(arrayHolder));
    }
    private int [] arrayholder;
    public void isEvenNumber(int [] evenNumberArray) {
        arrayholder = new int[evenNumberArray.length];
        for (int index = 0; index < evenNumberArray.length; index++) {
            if(evenNumberArray[index] % 2 == 0){
                arrayholder[index] = evenNumberArray[index];
            }
        }
    }

    public int [] getEvenNumber() {
        return arrayholder;
    }
}
