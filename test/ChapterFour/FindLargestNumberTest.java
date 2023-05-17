package ChapterFour;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindLargestNumberTest {
    FindLargestNumber trackLargeNumber = new FindLargestNumber();
    @Test public void userNumber(){
            trackLargeNumber.setUserNumber(23);
            trackLargeNumber.setUserNumber(65);
            trackLargeNumber.setUserNumber(2888);
            trackLargeNumber.setUserNumber(453);
            assertEquals(2888, trackLargeNumber.getUserNumber());
    }
   @Test public void testForNegativeNumbers(){
        trackLargeNumber.setUserNumber(-354);
        trackLargeNumber.setUserNumber(0);
        trackLargeNumber.setUserNumber(-33);
        trackLargeNumber.setUserNumber(-55);
        assertEquals(0, trackLargeNumber.getUserNumber());
   }
}
