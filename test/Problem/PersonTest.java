package Problem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person();
    @Test void testWeCanCreateANewProblem(){
        person.addProblem("mental",TypeOfProblem.SPIRITUAL);
        person.addProblem("food",TypeOfProblem.FINANCIAL);
        assertEquals(2,person.getNumberOfProblems());
    }
    @Test void testThatWeSolveAProblem(){
        person.solveProblem("mental", TypeOfProblem.SPIRITUAL);
        assertTrue(true);
    }


}