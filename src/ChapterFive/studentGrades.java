package ChapterFive;

import java.util.Objects;
import java.util.Scanner;

public class studentGrades {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String studentGrade_A = "";
        String studentGrade_B;
        String studentGrade_C;
        String studentGrade_D;
        int index;
        int indexForA = 0;
        int indexForB = 0;
        int indexForC = 0;
        int indexForD = 0;
        for (index = 1; index <= 5; index++) {
            System.out.println("Enter your name: ");
            String studentName = keyboardInput.next();
            System.out.println("Enter Student Grades: ");
            String studentGrades = keyboardInput.next().toUpperCase();
            switch (studentGrades) {
                case "A": if(studentGrades.equals("A")){
                    indexForA++;
                }
                break;
                case "B": if(studentGrades.equals("B")){
                        indexForB++;
                    }
                    break;
                case "C":if(studentGrades.equals("C")){
                        indexForC++;
                    }
                    break;
                case "D":if(studentGrades.equals("D")){
                        indexForD++;
                    }
                    break;
                default:
                    System.out.println("ENTER CORRECT GRADE");
            }
            System.out.println();
        }
        System.out.println("Number of Student that scored A = " + indexForA);
        System.out.println("Number of Student that scored B = " + indexForB);
        System.out.println("Number of Student that scored C = " + indexForC);
        System.out.println("Number of Student that scored D = " + indexForD);
    }
}
