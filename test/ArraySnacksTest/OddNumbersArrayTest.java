package ArraySnacksTest;

import ArraySnacks.OddNumbersArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddNumbersArrayTest {
    OddNumbersArray oddNumber = new OddNumbersArray();
    @Test public void oddNumberArray(){
        int [] arrayNumber = {1,2,3,4,5,6,7,8,9,10};
        oddNumber.checkForOddNumber(arrayNumber);
        assertEquals("[1, 0, 3, 0, 5, 0, 7, 0, 9, 0]", Arrays.toString(oddNumber.getOddNumber()));
    }
}