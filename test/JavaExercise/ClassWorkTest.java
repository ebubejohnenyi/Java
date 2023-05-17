package JavaExercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClassWorkTest {
    ClassWork arrayInput = new ClassWork();
    int [] arrayHolder = new int [10];
    @Test
    public void check (){
        int [] holder = ClassWork.arrayPlace(arrayHolder);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", Arrays.toString(holder));
    }
}
