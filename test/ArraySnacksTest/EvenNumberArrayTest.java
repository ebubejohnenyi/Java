package ArraySnacksTest;

import ArraySnacks.EvenNumberArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberArrayTest {
    EvenNumberArray evenNumber = new EvenNumberArray();
    @Test public void setEvenNumber(){
        int [] evenNumberArray = {1,2,3,4,5,6,7,8,9,10};
        evenNumber.isEvenNumber(evenNumberArray);
        assertEquals("[0, 2, 0, 4, 0, 6, 0, 8, 0, 10]", Arrays.toString(evenNumber.getEvenNumber()));
    }
}