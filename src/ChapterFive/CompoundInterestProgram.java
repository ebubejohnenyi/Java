package ChapterFive;

public class CompoundInterestProgram {
    public static void main(String[] args) {
        double principalAmount = 1000.0;
        double rate = 0.06;
        double rate1 = 0.07;
        double rate2 = 0.08;
        double rate3 = 0.08;
        double rate4 = 0.10;
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; year++) {
            double sum = principalAmount * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%, 20.2f%n", year, sum);
        }
    }
}
