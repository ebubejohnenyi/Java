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

    @Test public void diaryCan_beUnlocked(){
        myDairy.unlockedWith("word password");
        assertFalse(myDairy.isLocked());
    }
}
