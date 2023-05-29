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
        listImplementation.addToList(1);
        assertEquals(1, listImplementation.getAdded_Element());
    }
    @Test public void addToListDouble(){
        listImplementation.emptyList();
        listImplementation.addToList(1);
        listImplementation.addToList(2);
        assertEquals(2, listImplementation.getAdded_Element());
    }
    @Test public void removeFromList(){
        listImplementation.emptyList();
        listImplementation.addToList(1);
        listImplementation.removeFromList(1);
        assertEquals(0,listImplementation.checkIfRemoved());
    }
    @Test public void removeTwo_ElementFrom_List(){
        listImplementation.emptyList();
        listImplementation.addToList(1);
        listImplementation.addToList(2);
        listImplementation.removeFromList(1);
        assertEquals(1,listImplementation.checkIfRemoved());
    }
    @Test public void isPresent_InList(){
        listImplementation.emptyList();
        listImplementation.addToList(1);
        listImplementation.addToList(2);
        listImplementation.removeFromList(1);
        listImplementation.containsInList(1);
        assertTrue(listImplementation.containsInList(1));
    }
}
