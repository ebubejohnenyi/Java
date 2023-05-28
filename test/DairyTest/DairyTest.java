package DairyTest;

import Diary.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DairyTest {
    Diary myDairy;
    @BeforeEach public void setUp(){
        myDairy = new Diary("username","password");
    }
    @Test public void diary_Exist(){
        assertNotNull(myDairy);
    }
    @Test public void diaryIs_Locked(){
        assertTrue(myDairy.isLocked());
    }

    @Test public void diaryCorrectPassword_andIncorrectPasswrd(){
        myDairy.unlockedWith("password");
        assertTrue(myDairy.isLocked());
    }
    @Test public void addEntry(){
        myDairy.createEntry(12345,"My Dare Diary","I am a Digital Learner in Semicolon");
        assertEquals(1, myDairy.getAddedEntry());
    }
    @Test public void deleteEntry(){
        myDairy.deleteEntry();
        assertEquals(0, myDairy.deleteEntry());
    }
    @Test public void findEntry(){
        myDairy.findMy_gistById(12345);
        assertEquals();
    }
}
