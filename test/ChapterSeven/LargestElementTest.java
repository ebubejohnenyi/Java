package ChapterSeven;

import ArraySnacks.LargestArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestElementTest {
    LargestArray largestArray;

    @BeforeEach
    public void setUp() {
        largestArray = new LargestArray();
    }
    @Test
    public void getLargestElement() {
        // given
        int [] arrays = {1, 2, 3, 4, 5, 9};
        // when
       int  getLar = largestArray.setLargestNumber(arrays);

        // asserts
        assertEquals(9, getLar);
    }

    @Test
    public void tesForAnotherArray() {
        // given
        int [] arrays = {100, 4, 78, 54};
        // when
        int  getLar = largestArray.setLargestNumber(arrays);

        // asserts
        assertEquals(100, getLar);
    }


    @Test
    public void tesForNegative() {
        // given
        int [] arrays = {-8, -9, -7, -1};
        // when
        int  getLar = largestArray.setLargestNumber(arrays);

        // asserts
        assertEquals(-1, getLar);
    }

}
