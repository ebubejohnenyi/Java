package Problem;

import java.util.ArrayList;
import java.util.List;

public class Person {
    List<Problems> problems = new ArrayList<>();
    private boolean isSolved = true;
    Problems solveProblem;

    public void addProblem(String name, TypeOfProblem type){
        Problems newProblems = new Problems(name, type);
        problems.add(newProblems);
    }
    public int getNumberOfProblems(){
        return problems.size();
    }
    public void solveProblem(String name, TypeOfProblem type){
        for (Problems newProblems : problems) {
           if(newProblems.getName().equals(name) && newProblems.getType().equals(type)){
               problems.remove(newProblems);
               break;
           }
        }
    }
    public boolean isProblemSolved() {
        return isSolved;
    }
}
