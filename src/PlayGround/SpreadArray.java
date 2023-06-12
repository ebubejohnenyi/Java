package PlayGround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpreadArray {
    private static List<int[]> lister = new ArrayList<>();
    public static void main(String[] args) {

        int [] array = {10,25,43,62,12};
        int [] arrayHolder = new int[array.length];
        int [] firstNumber = new int[array.length];
        int [] secondHolderNumber = new int[array.length];
        for (int index = 0; index < arrayHolder.length; index++) {
            int numbers = array[index];
            firstNumber[index] = numbers % 10;
            lister.add(firstNumber);
        }
        for (int secondIndex = 0; secondIndex < arrayHolder.length; secondIndex++) {
            int secondNumber = array[secondIndex];
            secondHolderNumber[secondIndex] = secondNumber / 10;
            lister.add(secondHolderNumber);
        }

    }
}
