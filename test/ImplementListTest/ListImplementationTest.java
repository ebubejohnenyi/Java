package ImplementListTest;

import ImplementList.ListImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListImplementationTest {
    ListImplementation listImplementation = new ListImplementation();
    @Test public void theList_Exist(){
        assertNotNull(listImplementation);
    }
    @Test public void theList_isEmpty(){
        listImplementation.emptyList();
        assertTrue(listImplementation.emptyList());
    }
    @Test public void addToList(){
        listImplementation.emptyList();
        assertTrue(listImplementation.emptyList());
        listImplementation.push("Today");
        assertEquals(1, listImplementation.getAdded_Element());
    }
    @Test public void addToListDouble(){
        listImplementation.emptyList();
        assertTrue(listImplementation.emptyList());
        listImplementation.push("Today");
        listImplementation.push("Tomorrow");
        assertEquals(2, listImplementation.getAdded_Element());
    }
    @Test public void removeFromList(){
        listImplementation.emptyList();
        listImplementation.push("Today");
        listImplementation.push("Tomorrow");
        listImplementation.pop();
        assertEquals(0,listImplementation.getPop_fromList());
    }
}
