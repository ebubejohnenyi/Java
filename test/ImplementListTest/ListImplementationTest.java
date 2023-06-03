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
        listImplementation.addToList(0,1);
        assertEquals(1, listImplementation.getAdded_Element());
    }
    @Test public void addToListDouble(){
        listImplementation.emptyList();
        listImplementation.addToList(0,1);
        listImplementation.addToList(1,2);
        assertEquals(2, listImplementation.getAdded_Element());
    }
    @Test public void removeFromList(){
        listImplementation.emptyList();
        listImplementation.addToList(0,1);
        listImplementation.removeFromList(0);
        assertEquals(0,listImplementation.getElement(0));
    }
    @Test public void removeTwo_ElementFrom_List(){
        listImplementation.emptyList();
        listImplementation.addToList(0,1);
        listImplementation.addToList(1,2);
        listImplementation.addToList(2,3);
        listImplementation.removeFromList(0);
        listImplementation.removeFromList(1);
        assertEquals(3, listImplementation.getElement(2));
    }
    @Test public void test_ListCan_contain(){
        listImplementation.emptyList();
        listImplementation.addToList(0,1);
        listImplementation.addToList(1,2);
        listImplementation.addToList(2,3);
        assertTrue(listImplementation.contains(3));
    }
    @Test public void test_ListCan_Clear(){
        listImplementation.emptyList();
        listImplementation.addToList(0,1);
        listImplementation.addToList(1,2);
        listImplementation.addToList(2,3);
        listImplementation.addToList(3,4);
        assertEquals(0,listImplementation.clear());
    }
    @Test public void test_ForList_size(){
        listImplementation.emptyList();
        listImplementation.addToList(0,1);
        listImplementation.addToList(1,2);
        listImplementation.addToList(2,3);
        listImplementation.addToList(3,4);
        assertEquals(4,listImplementation.size());
    }
    @Test public void test_CanGet(){
        listImplementation.emptyList();
        listImplementation.addToList(0,1);
        listImplementation.addToList(1,2);
        listImplementation.addToList(2,3);
        assertEquals(1, listImplementation.get(0,1));
    }

    @Test public void test_That_ListSet(){
        listImplementation.emptyList();
        listImplementation.addToList(0,1);
        listImplementation.addToList(1,2);
        assertEquals(3, listImplementation.set(1,3));
    }
    @Test public void test_ForIndexOf(){
        listImplementation.emptyList();
        listImplementation.addToList(0,1);
        listImplementation.addToList(1,2);
        listImplementation.addToList(2,3);
        listImplementation.addToList(3,4);
        assertEquals(3, listImplementation.indexOf(4));
    }
    @Test public void testFor_LastIndex(){
        listImplementation.emptyList();
        listImplementation.addToList(0,3);
        listImplementation.addToList(1,2);
        listImplementation.addToList(2,1);
        listImplementation.lastIndexOf(1);
        assertEquals(2, listImplementation.indexOf(1));
    }
//    @Test public void EqualElement_inList(){
//        listImplementation.emptyList();
//        listImplementation.addToList(1);
//        listImplementation.addToList(2);
//        listImplementation.addToList(3);
//        listImplementation.addToList(4);
//        listImplementation.addToList(5);
//        listImplementation.equals(4);
//        assertEquals(4,listImplementation.equals(4));
//    }
}
