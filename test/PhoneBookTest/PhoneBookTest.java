package PhoneBookTest;

import PhoneBook.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test public void testThatPhoneBookExist(){
        assertNotNull(phoneBook);
    }
    @Test public void testThatPhoneBookIsEmpty(){
        phoneBook.isEmpty();
        assertEquals(true, phoneBook.isEmpty());
    }
    @Test public void test_ICanAdd_ToPhoneBook(){
        phoneBook.isEmpty();
        phoneBook.add("John", "09054498013");
        assertEquals(1, phoneBook.phoneBookSize());
    }
    @Test public void test_ICanDelete_FromPhoneBook(){
        phoneBook.isEmpty();
        phoneBook.add("John","09054498013");
        phoneBook.add("Mr.Chibuzor","07031038346");
        phoneBook.add("Snow","07052456491");
        phoneBook.deleteByName("Snow");
        assertEquals(2, phoneBook.phoneBookSize());
    }
    @Test public void test_ICan_searchByName(){
        phoneBook.isEmpty();
        phoneBook.add("John","09054498013");
        phoneBook.add("Mr.Chibuzor","07031038346");
        phoneBook.add("Snow","07052456491");
        assertEquals("John", phoneBook.searchBy("John"));
    }
    @Test public void test_ICan_deleteAll(){
        phoneBook.isEmpty();
        phoneBook.add("John","09054498013");
        phoneBook.add("Mr.Chibuzor","07031038346");
        phoneBook.add("Snow","07052456491");
        phoneBook.deleteAll();
        assertEquals(0, phoneBook.phoneBookSize());
    }
    
}
