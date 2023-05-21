package Problem;

import java.util.ArrayList;
import java.util.List;

public class Person {
    List<Problems> problems = new ArrayList<>();
    private boolean isSolved;
    Problems solveProblem;

    public void addProblem(String name, TypeOfProblem type){
        Problems newProblems = new Problems(name, type);
        problems.add(newProblems);
    }
    public int getNumberOfProblems(){
        return problems.size();
    }
    public void solveProblem(String name, TypeOfProblem type){
        solveProblem = new Problems(name, type);
        problems.remove(solveProblem);
        isSolved = true;
    }
    public boolean isProblemSolved() {
        problems.remove(solveProblem);
        return isSolved;
    }
}
