package JavaExercise;

import java.util.Arrays;

public class DuplicateNumbersInArray {
    public static void main(String[] args) {
        int [] arrayHolder = {1,2,4,4,5,5};
        int count = 0;
        int holder = 0;
        for (int index = 0; index < arrayHolder.length; index++) {
            for (int secondIndex = index + 1; secondIndex < arrayHolder.length; secondIndex++) {
                if(arrayHolder[index] == arrayHolder[secondIndex]){
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(arrayHolder));
    }
}
