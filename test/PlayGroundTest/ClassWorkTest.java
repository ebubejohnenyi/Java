package PlayGroundTest;

import PlayGround.ClassWork;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClassWorkTest {
    ClassWork clasWork = new ClassWork();
    @Test public void setArrayHolder(){
        int[] arrayNumber = {2,5,1};
        int [] expected = {2,5,1,0,0,0};
        ClassWork.setArrayHolder(arrayNumber);
        assertEquals(Arrays.toString(expected), ClassWork.getArrayHolder());
    }
}