package ArraySnacksTest;

import ArraySnacks.OccuranceOfElement;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OccuranceOfElementTest {
    OccuranceOfElement sameElement = new OccuranceOfElement();
    @Test public void occurredElement(){
        int [] arrayElement = {1,2,3,4,5};
        int [] checkOccurredArrayHere = {1,2,3,4,5};
        sameElement.setOccurredElement(arrayElement, checkOccurredArrayHere);
        assertTrue(true, "This is the result for when it occure");
    }
    @Test public void occurredElementDontOccur(){
        int [] arrayElement = {23,45,67,89,34};
        int [] checkOccurredArrayHere = {1,2,3,4,5};
        sameElement.setOccurredElement(arrayElement, checkOccurredArrayHere);
        assertFalse(false, "This is the result for it doesn't occur");
    }
}