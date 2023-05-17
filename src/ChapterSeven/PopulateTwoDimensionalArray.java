package ChapterSeven;

import java.util.Arrays;

public class PopulateTwoDimensionalArray {
    public static void main(String[] args) {
        int [][] arrayHolder = new int[5][5];
        arrayHolder[0] = new int[5];
        arrayHolder[1] = new int[10];
        arrayHolder[2] = new int[2];
        arrayHolder[3] = new int[5];

        int [] firstRow = arrayHolder[0];
        for (int startingIndex = 0; startingIndex < firstRow.length; startingIndex++) {
            firstRow [startingIndex] = startingIndex;
        }
        System.out.print(Arrays.toString(firstRow) + "  ");

        int [] secondRow = arrayHolder[1];
        Arrays.fill(secondRow, 0);
        System.out.print(Arrays.toString(secondRow) + "  ");

        int [] thirdRow = arrayHolder[2];
        thirdRow = new int[]{400,500};
        System.out.print(Arrays.toString(thirdRow) + "  ");

        int [] fourthRow = arrayHolder[4];
        int dominantNumber = 100;
        for (int startingIndex = 0; startingIndex < fourthRow.length; startingIndex++) {
            fourthRow[startingIndex] = (startingIndex+1) * dominantNumber;
        }
        System.out.println(Arrays.toString(fourthRow));
    }
}
