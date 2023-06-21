package PlayGround;

import java.util.Arrays;
import java.util.Scanner;

public class Sudoko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 9: ");
        int userSudoNumber = input.nextInt();
        int [] firstRow = new int[9];
        int [] secondRow = new int[9];
        int [] thirdRow = new int[9];
        int [] forthRow = new int[9];
        int [] fifthRow = new int[9];
        int [] sixthRow = new int[9];
        int [] seventhRow = new int[9];
        int [] eightRow = new int[9];
        int [] ninthRow = new int[9];
        for (int index = 0; index < userSudoNumber; index++) {
            firstRow[index] = index + 1;
        }
        System.out.println("Enter a number 8: ");
        int userSudoSecondNumber = input.nextInt();
        for (int index = 0; index < userSudoSecondNumber; index++) {
            secondRow[index] = index;
            secondRow[0] = 9;
        }
        System.out.println("Enter a number 8: ");
        int userSudoThirdNumber = input.nextInt();
        for (int index = 0; index < userSudoThirdNumber; index++) {
            thirdRow[index + 1] = index;
            thirdRow[0] = 8;
            thirdRow[1] = 9;
        }
        System.out.println("Enter a number 7: ");
        int userSudoFourthNumber = input.nextInt();
        for (int index = 0; index < userSudoFourthNumber; index++) {
            forthRow[index + 2] = index;
            forthRow[0] = 7;
            forthRow[1] = 8;
            forthRow[2] = 9;
        }
        System.out.println("Enter a number 6: ");
        int userSudoFifthNumber = input.nextInt();
        for (int index = 0; index < userSudoFifthNumber; index++) {
            fifthRow[index + 3] = index;
            fifthRow[0] = 6;
            fifthRow[1] = 7;
            fifthRow[2] = 8;
            fifthRow[3] = 9;
        }
        System.out.println("Enter a number 5: ");
        int userSudoSixthNumber = input.nextInt();
        for (int index = 0; index < userSudoSixthNumber; index++) {
            sixthRow[index + 4] = index;
            sixthRow[0] = 5;
            sixthRow[1] = 6;
            sixthRow[2] = 7;
            sixthRow[3] = 8;
            sixthRow[4] = 9;
        }
        System.out.println("Enter a number 4: ");
        int userSudoSevenNumber = input.nextInt();
        for (int index = 0; index < userSudoSevenNumber; index++) {
            seventhRow[index + 5] = index;
            seventhRow[0] = 4;
            seventhRow[1] = 5;
            seventhRow[2] = 6;
            seventhRow[3] = 7;
            seventhRow[4] = 8;
            seventhRow[5] = 9;
        }
        System.out.println("Enter a number 3: ");
        int userSudoEigthNumber = input.nextInt();
        for (int index = 0; index < userSudoEigthNumber; index++) {
            eightRow[index + 6] = index;
            eightRow[0] = 3;
            eightRow[1] = 4;
            eightRow[2] = 5;
            eightRow[3] = 6;
            eightRow[4] = 7;
            eightRow[5] = 8;
            eightRow[6] = 9;
        }
        System.out.println("Enter a number 2: ");
        int userSudoNinthNumber = input.nextInt();
        for (int index = 0; index < userSudoNinthNumber; index++) {
            eightRow[index + 7] = index;
            eightRow[0] = 2;
            eightRow[1] = 3;
            eightRow[2] = 4;
            eightRow[3] = 5;
            eightRow[4] = 6;
            eightRow[5] = 7;
            eightRow[6] = 8;
            eightRow[7] = 9;
        }
        System.out.println(Arrays.toString(firstRow));
        System.out.println(Arrays.toString(secondRow));
        System.out.println(Arrays.toString(thirdRow));
        System.out.println(Arrays.toString(forthRow));
        System.out.println(Arrays.toString(fifthRow));
        System.out.println(Arrays.toString(sixthRow));
        System.out.println(Arrays.toString(seventhRow));
        System.out.println(Arrays.toString(eightRow));
    }
}
