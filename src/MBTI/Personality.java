package MBTI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Personality {
    public static void main(String[] args) {
        userName();
        personalityMBTI();
    }
    static Scanner scan = new Scanner(System.in);
    public static void userName(){
        System.out.println("Enter your name: ");
        String userName = scan.nextLine();
    }
    public static void personalityMBTI(){
        String [] questionHolder = new String[40];
        questionHolder[0] = "A. expend energy, enjoy groups";
        questionHolder[1] = "B. converse energy, enjoy one-on-one";
        questionHolder[2] = "A. Interpret literally,";
        questionHolder[3] = "B. look for meaning and responsibility";
        questionHolder[4] = "A. logical, thinking , question";
        questionHolder[5] = "B. empathetic, feeling, accommodating";
        questionHolder[6] = "A. organized, orderly";
        questionHolder[7] = "B. flexible, adaptiable";
        questionHolder[8] = "A. more outgoing, think out loud ";
        questionHolder[9] = "B. more reserve, think to your self";
        questionHolder[10] = "A. practical, realistic, experiential";
        questionHolder[11] = "B. imagination, innovation, theoritical";
        questionHolder[12] = "A. candid, straight forward, frank";
        questionHolder[13] = "B. tactful, kind, encouraging";
        questionHolder[14] = "A. plan, schedule";
        questionHolder[15] = "B. unplanned, spontaneous";
        questionHolder[16] = "A. seek many tasks, public activities, interract with others";
        questionHolder[17] = "B. seek private, solitary activities with quiet concentrate ";
        questionHolder[18] = "A. standard, usaual, concentration";
        questionHolder[19] = "B. different, novel, unique";
        questionHolder[20] = "A. firm, tend to criticize, hold the line";
        questionHolder[21] = "B. gentle, tend to appreciate, conciliate";
        questionHolder[22] = "A. regulate, structured";
        questionHolder[23] = "B. easy-going live and let live";
        questionHolder[24] = "A. external, communicative, express yourself";
        questionHolder[25] = "B. internal, reticent, keep to yourself";
        questionHolder[26] = "A. focus on here-and-now";
        questionHolder[27] = "B. look to the future, global perspective, big picture";
        questionHolder[28] = "A. tough-minded just";
        questionHolder[29] = "B. tender-hearted, merciful";
        questionHolder[30] = "A. preparation, plan ahead";
        questionHolder[31] = "B. go with the flow, adapt as you go";
        questionHolder[32] = "A. active, initiate";
        questionHolder[33] = "B. reflective, deliberate";
        questionHolder[34] = "A. fact, things, what is";
        questionHolder[35] = "B. ideas, dream, what could be, philosophical";
        questionHolder[36] = "A. matter of fact, issue-oreinted";
        questionHolder[37] = "B. sensitive, people- oriented, compassionate";
        questionHolder[38] = "A. control govern";
        questionHolder[39] = "B. latitude, freedom ";

        for (int index = 0; index < questionHolder.length - 1; index+=2) {
            System.out.println(questionHolder[index] + "    " + questionHolder[index + 1]);
            String userAnswer = scan.nextLine().toLowerCase();
            if (userAnswer != "a" || userAnswer != "b"){
                System.out.println("Expected A or B as Response \nI know this is an error, Please trt again: ");
                break;
            }
        }

    }
}
