package JavaExercise;

import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args) {
//        int [] arrayHolder = new int [10];
//        for (int index = 0; index < arrayHolder.length; index++) {
//            arrayHolder [index] = index + 1;
//        }
//        System.out.println(Arrays.toString(arrayHolder));
        int[] array = new int[10];
//        System.out.println(Arrays.toString(arrayPlace(array)));
    }
    public static int[] arrayPlace(int [] arrayInput){
        int [] arrayHolder = new int [10];
        for (int index = 0; index < arrayHolder.length; index++ ){
            arrayHolder[index] = index + 1;
        }
        return arrayHolder;
    }


}
