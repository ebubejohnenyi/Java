package Problem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person();
    @Test public void testWeCanCreateANewProblem(){
        person.addProblem("mental",TypeOfProblem.SPIRITUAL);
        person.addProblem("food",TypeOfProblem.FINANCIAL);
        assertEquals(2,person.getNumberOfProblems());
    }
    @Test public void testThatWeSolveAProblem(){
        person.addProblem("mental", TypeOfProblem.SPIRITUAL);

        person.solveProblem("mental", TypeOfProblem.SPIRITUAL);
        assertEquals(0,person.getNumberOfProblems());
    }
    @Test public void testI_canSolve_twoProblem(){
        person.addProblem("mental", TypeOfProblem.SPIRITUAL);
        person.addProblem("food", TypeOfProblem.FINANCIAL);
        assertEquals(2,person.getNumberOfProblems());
        person.solveProblem("mental", TypeOfProblem.SPIRITUAL);
        person.solveProblem("food", TypeOfProblem.FINANCIAL);
        assertTrue(person.isProblemSolved());
        assertEquals(0,person.getNumberOfProblems());
    }
}