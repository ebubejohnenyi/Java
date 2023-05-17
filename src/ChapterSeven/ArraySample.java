package ChapterSeven;

import java.util.Arrays;

public class ArraySample {
    public static void main(String [] args){
        int [] array = {10,20,30,40,50,60};
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
    }

//    private static String toString(int [] array){
//        String arrayRepresentation = "[";
//        for (int index = 0; index < array.length; index++) {
//            if (index != array.length - 1) arrayRepresentation += array[index] + ",";
//            else arrayRepresentation += array[index];
//        }
//        arrayRepresentation += "]";
//        return arrayRepresentation;
//    }
}
