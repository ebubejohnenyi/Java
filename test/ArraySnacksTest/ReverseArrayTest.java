package ArraySnacksTest;

import ArraySnacks.ReverseArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {
    ReverseArray arrayReversal = new ReverseArray();
    @Test public void reverseArray(){
        int [] arrayNumber = {1,2,3,4,5};
        int [] expected = {5,4,3,2,1};
//        arrayReversal.reverseArrayNumbers(arrayNumber);
        assertArrayEquals(expected, arrayReversal.reverseArrayNumbers(arrayNumber));
    }
}