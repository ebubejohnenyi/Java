package JavaExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopTest {
    @Test
    public void checker(){
//        for (int i = 1; i <= 3; i++) {
//            Loop.setMethod(i);
//       }

        assertEquals(1, Loop.getMethod());
    }
}
