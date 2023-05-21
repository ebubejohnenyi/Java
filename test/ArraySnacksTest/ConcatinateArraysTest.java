package ArraySnacksTest;

import ArraySnacks.ConcatinateArrays;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ConcatinateArraysTest {
    ConcatinateArrays concatinateArrays = new ConcatinateArrays();
    @Test public void concatenateArrays(){
        // Given
        String [] arrayOfNumber = {"1,2,3"};
        String [] arrayOfLetter = {"a,b,c"};

        //When
        concatinateArrays.setConcatenateArrays(arrayOfNumber,arrayOfLetter);

        // Assert
        assertEquals("[1,2,3, a,b,c]", Arrays.toString(concatinateArrays.getCombineArray()));
    }




}