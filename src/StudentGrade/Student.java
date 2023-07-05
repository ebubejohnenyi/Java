package StudentGrade;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name, subject;
    private int score;
    private List <Subject> subjects = new ArrayList<>();
    public Student(String name, int score, String subject){
        if(name.equals(null) || name.isEmpty()) throw new IllegalArgumentException("NAME CANNOT BE EMPTY");
        if(subject.equals(null) || subject.isEmpty()) throw new IllegalArgumentException("SUBJECT CANNOT BE EMPTY");
        this.name = name;
        this.score = score;
        this.subject = subject;
    }
    @Override public String toString(){
        return getName() +" "+ getScore();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
