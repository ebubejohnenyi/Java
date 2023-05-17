package ChapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String [] args){
        Scanner keyboard = new Scanner (System.in);
//        double firstValue = 239.99, secondValue = 129.75, thirdValue = 99.95, fourthValue = 350.89;
//        double salesPersonTotalValue = 0;
//        double salesPercent = 0.09;
//        double salesCommission = 0;
//        double salesPersonSalary = 200;
//
//        System.out.print("Enter number of first item sold: ");
//        int userFirstInput = keyboard.nextInt();
//        salesPersonTotalValue += (userFirstInput * firstValue);
//        System.out.print("Enter number of second item sold: ");
//        int userSecondInput = keyboard.nextInt();
//        salesPersonTotalValue += (userSecondInput * secondValue);
//        System.out.print("Enter number of third item sold: ");
//        int userThirdInput = keyboard.nextInt();
//        salesPersonTotalValue += (userThirdInput * thirdValue);
//        System.out.print("Enter number of first item sold: ");
//        int userFourthInput = keyboard.nextInt();
//        salesPersonTotalValue += (userFourthInput * fourthValue);
//        System.out.println("Total item sold for this week is: " + salesPersonTotalValue + "\n");
//
//        salesCommission = salesPercent + salesPersonTotalValue;
//        System.out.println("The sales persons salary plus sales persons commission for the week is: " + salesCommission + salesPersonSalary);

    }
    private double totalItemSoldForLastWeek, commissionForSales, totalWeekCommission;

    public void itemsSoldForLastWeek(int firstItem, int secondItem, int thirdItem, int fourthItem) {
        double firstValue = 239.99, secondValue = 129.75, thirdValue = 99.95, fourthValue = 350.89;
        if(firstItem <= 0) firstItem = 0;
        else if (secondItem <= 0) secondItem = 0;
        else if (thirdItem <= 0) thirdItem = 0;
        else if (fourthItem <= 0) fourthItem = 0;
        else totalItemSoldForLastWeek = (firstValue * firstItem) + (secondValue * secondItem) + (thirdValue * thirdItem) + (fourthValue * fourthItem);
    }
    public double getValueSoldForLastWeek() {
        return totalItemSoldForLastWeek;
    }
    public void salesPersonCommission(double totalItemSoldForLastWeek, double commissionPercent) {
        commissionForSales = totalItemSoldForLastWeek * commissionPercent;
    }

    public double getCommissionForLastWeek() {
        return commissionForSales;
    }

    public void salesPersonCommissionForWeek(double commissionForSales) {
        double salesPersonSalary = 200;
        totalWeekCommission = commissionForSales + salesPersonSalary;
        System.out.println("The Sales Person commission for the week is: " + "$" + totalWeekCommission);
    }

    public double getSalePersonSalary() {
        return totalWeekCommission;
    }

}
