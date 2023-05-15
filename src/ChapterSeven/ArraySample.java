package ChapterSeven;

public class Arrays {
    public static void main(String [] args){
        // create an array
        int [] array =  new int [10]; // how it looks like [0,0,0,0,0,0,0,0,0,0]
        // insert elements to array
        array[2] = 10; // [0,0,10,0,0,0,0,0,0,0]
        System.out.println(Arrays.toString(array)); // printing it out
    }

    private static String toString(int [] array){
        String arrayRepresentation = "[";
        for (int index = 0; index < array.length; index++) {
            if (index != array.length - 1) arrayRepresentation += array[index] + ",";
            else arrayRepresentation += array[index];
        }
        arrayRepresentation += "]";
        return arrayRepresentation;
    }
}
