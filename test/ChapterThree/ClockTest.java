package ChapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    Clock worldClock = new Clock(22, 58, 45);
    @Test
    public void setHour(){
        worldClock.setHour(22);
        assertEquals(22, worldClock.getHour());
    }
    @Test
    public void setMinute(){
        worldClock.setMinute(58);
        assertEquals(58, worldClock.getMinute());
    }
    @Test
    public void setSeconds(){
        worldClock.setSeconds(45);
        assertEquals(45, worldClock.getSeconds());
    }
}
