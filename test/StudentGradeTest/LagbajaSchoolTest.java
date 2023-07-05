package StudentGradeTest;

import StudentGrade.LagbajaSchool;
import StudentGrade.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LagbajaSchoolTest {
    private LagbajaSchool lagbajaSchool;
    @BeforeEach public void setUp(){
        lagbajaSchool = new LagbajaSchool();
    }
    @Test public void testI_canHaveStudent(){
        lagbajaSchool.haveStudent("John", 20, "English");
        assertEquals(1, lagbajaSchool.countStudent());
    }
    @Test  public void testI_forTheHighest_ScoringStudent(){
        lagbajaSchool.haveStudent("John", 80, "Java");
        lagbajaSchool.haveStudent("Paul", 50, "English");
        lagbajaSchool.haveStudent("Peter", 10, "Maths");
        lagbajaSchool.haveStudent("Rachael", 55, "Government");
        assertEquals(80, lagbajaSchool.highestScore());
    }
    @Test  public void testI_forTheLowest_ScoringStudent(){
        lagbajaSchool.haveStudent("John", 80, "Java");
        lagbajaSchool.haveStudent("Paul", 50, "English");
        lagbajaSchool.haveStudent("Peter", 30, "Maths");
        lagbajaSchool.haveStudent("Rachael", 55, "Government");
        assertEquals(30, lagbajaSchool.lowestScore());
    }
}
