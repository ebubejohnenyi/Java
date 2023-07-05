package StudentGrade;

import java.util.ArrayList;
import java.util.List;

public class LagbajaSchool {
    private List <Student> students = new ArrayList<>();
    private int count;
    public void haveStudent(String name, int score, String subject){
        Student student = new Student(name, score, subject);
        students.add(student);
        ++count;
    }

    public int countStudent() {
        return students.size();
    }

    public int highestScore() {
        int highestScore = -9999;
        for (Student studentsList: students) {
            int score = studentsList.getScore();
            if(score > highestScore){
                highestScore = score;
            }
        }
        return highestScore;
    }

    public int lowestScore() {
        int lowestScore = 9999;
        for (Student studentsList: students) {
            int score = studentsList.getScore();
            if(score < lowestScore){
                lowestScore = score;
            }
        }
        return lowestScore;
    }
}
