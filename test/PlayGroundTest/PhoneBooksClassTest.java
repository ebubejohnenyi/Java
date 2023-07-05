package PlayGroundTest;

import PlayGround.PhoneBookClass;
import PlayGround.PhoneBooksClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBooksClassTest {
    PhoneBookClass newPhoneBook = new PhoneBookClass("John","password","09012345678");
    PhoneBooksClass newPhoneBooks = new PhoneBooksClass();
    @Test public void isEmpty(){
        newPhoneBook.isEmpty();
        assertTrue(newPhoneBook.isEmpty());
    }
    @Test public void iCanUnlockedWithPassword(){
        newPhoneBook.isEmpty();
        assertEquals("password", newPhoneBook.unlockedWith("password"));
    }
    @Test public void iCanCreateNewPhoneBook(){
        newPhoneBook.isEmpty();
        newPhoneBook.unlockedWith("password");
        newPhoneBooks.createPhoneBook("John","password","09012345678");
        assertEquals(3, newPhoneBooks.getAllPhoneBook());
    }
    @Test public void getAllPhoneBook(){
        newPhoneBook.isEmpty();
        newPhoneBook.unlockedWith("password");
//        newPhoneBook.get
    }
    @Test public void iCanUnlockAll(){
        newPhoneBook.isEmpty();
        newPhoneBook.unlockedWith("password");
        newPhoneBooks.createPhoneBook("John","password","09012345678");
        newPhoneBooks.createPhoneBook("Paul","password","09012345678");
        assertTrue(newPhoneBooks.unLockAll(), "true");
    }
}