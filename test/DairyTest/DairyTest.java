package DairyTest;

import Diary.*;
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
        assertTrue(myDairy.islocked());
    }

    @Test public void diaryCorrectPassword_andIncorrectPasswrd(){
        myDairy.unlockedWith("password");
        assertTrue(myDairy.isUnlocked());
    }
    @Test public void addEntry(){
        myDairy.unlockedWith("password");
        assertTrue(myDairy.isUnlocked());
        myDairy.createEntry("My Dare Diary","I am a Digital Learner in Semicolon");
        assertEquals(1, myDairy.getAddedEntry());
    }
    @Test public void deleteEntry(){
        myDairy.unlockedWith("password");
        assertTrue(myDairy.isUnlocked());
        myDairy.createEntry("My Dare Dairy","I am a Digital Learner in Semicolon");
        myDairy.deleteEntry();
        assertEquals(0, myDairy.deleteEntry());
    }
    @Test public void findEntry(){
        myDairy.unlockedWith("password");
        assertTrue(myDairy.isUnlocked());
        myDairy.createEntry("My Dare Dairy","I am a Digital Learner in Semicolon");
        myDairy.createEntry("Vampire Dairy","I'll come hunt you");
        Gists body = myDairy.findMy_gistById("Vampire Dairy");
        assertEquals("I'll come hunt you", body.getBody());
    }
    @Test public  void updateEntry(){
        myDairy.unlockedWith("password");
        assertTrue(myDairy.isUnlocked());
        myDairy.createEntry("My Dare Dairy", "I am a Digital Learner in semicolon");
        myDairy.createEntry("Vampire Dairy", "I'll hunt you");
        myDairy.updateEntry(123,"Software Engineer","I will become whom i want to be");
        Gists body = myDairy.findMy_gistById("Software Engineer");
        assertEquals("I will become whom i want to be", body.getBody());
    }
}
