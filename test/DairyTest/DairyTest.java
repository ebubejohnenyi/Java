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

    @Test public void test_Ican_UnlockedDairy_WithPassword(){
        myDairy.unlockedWith("password");
        assertTrue(myDairy.isUnlocked());
    }
    @Test public void test_Ican_CreateNewGist(){
        myDairy.islocked();
        myDairy.unlockedWith("password");
        myDairy.createNewGist("My Dare Diary","I am a Digital Learner in Semicolon");
        assertEquals(1, myDairy.getAllGists());
    }
    @Test public void testICan_deleteGist_ByTitle(){
        myDairy.islocked();
        myDairy.unlockedWith("password");
        myDairy.createNewGist("My Dare Dairy","I am a Digital Learner in Semicolon");
        myDairy.deleteGist_ByTitle("My Dare Dairy");
        assertEquals(0, myDairy.getAllGists());
    }
    @Test public void test_Ican_findGist_By_Title(){
        myDairy.islocked();
        myDairy.unlockedWith("password");
        myDairy.createNewGist("My Dare Dairy","I am a Digital Learner in Semicolon");
        myDairy.createNewGist("Vampire Dairy","I'll come hunt you");
        assertEquals("I'll come hunt you", myDairy.findMy_gist_ByTitle("Vampire Dairy"));
    }
    @Test public  void updateEntry(){
        myDairy.islocked();
        myDairy.unlockedWith("password");
        myDairy.createNewGist("Hello World","I am John");
        myDairy.updateEntry(1,"Semicolon World", "Innovative Mindset");
        assertEquals("Innovative Mindset", myDairy.findMy_gist_ByTitle("Semicolon World"));
    }
}
