package PlayGroundTest;

import PlayGround.MultiplyTwoNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTwoNumbersTest {
    MultiplyTwoNumbers multiplyTwoNumber = new MultiplyTwoNumbers();
    @Test public void multiply(){
        multiplyTwoNumber.twoNumber(5,2);
        assertEquals(10, multiplyTwoNumber.getSum());
    }
}