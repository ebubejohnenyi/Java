package ChapterFour;

public class TaxCalculator {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String userName;
//        double userEarning, discountReceive, totalTax;
//        int year;
//        System.out.print("Enter name: ");
//        userName = input.next();
//        System.out.print("Enter your earnings: ");
//        userEarning = input.nextDouble();
//        System.out.print("Enter given year(s): ");
//        year = input.nextInt();
//        if(userEarning >= 1000 && userEarning <= 20_000){
//            discountReceive = userEarning * 0.15;
//            totalTax = discountReceive * year;
//            System.out.println("You're given 15% discount and your new earnings is: " + totalTax);
//        }
//        else if (userEarning > 20_000){
//            discountReceive = userEarning * 0.20;
//            totalTax = discountReceive * year;30_000
//            System.out.println("You're given 20% discount and your new earnings is: " + totalTax);
//        }
//        else System.out.println("Invalid amount.");

    }


    private String name;
    private double citizenEarning, citizenExcessEarning, sumDiscount, excessDiscount, initialDiscount, totalTax, fiftenPercentDiscount = 0.15, twentyPercentDiscount = 0.20, thirtyThousandEarnings = 30_000;
    private int year;
    public void citizenName(String name) {
        this.name = name;
    }

    public String getCitizenName() {
        return name;
    }

    public void calculateCitizenEarningDiscount(double citizenEarning) {
        if(citizenEarning <= 0) this.citizenEarning = 0;
        else if(citizenEarning <= thirtyThousandEarnings){
            initialDiscount = citizenEarning * fiftenPercentDiscount;
        }
        else {
            citizenExcessEarning = citizenEarning - thirtyThousandEarnings;
            excessDiscount = citizenExcessEarning * twentyPercentDiscount;
            initialDiscount = thirtyThousandEarnings * fiftenPercentDiscount;
            sumDiscount = excessDiscount + initialDiscount;
        }
    }
    public double getInitialDiscount() {
        return sumDiscount;
    }

    public void totalCitizenTax(double totalDiscount, int year) {
        if (year <= 0) this.year = 0;
        totalTax = totalDiscount * year;
    }

    public double getTotalTax() {
        return totalTax;
    }
}
