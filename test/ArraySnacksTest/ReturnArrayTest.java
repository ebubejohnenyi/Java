package ArraySnacksTest;

import ArraySnacks.ReturnArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReturnArrayTest {
    ReturnArray returnInArrayForm = new ReturnArray();
    @Test public void returnInArray(){
        int [] numbers = {1,2,3,4,5};
        returnInArrayForm.setReturnArray(numbers);
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(returnInArrayForm.getInArrayForm()));
    }
}