package ChapterFour;

public class GasMileage {
    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        int userMiles, userGallon, totalMiles, totalGallon;
//        totalMiles = 0;
//        totalGallon = 0;
//
//        while(true){
//            System.out.print("Enter your miles: ");
//            userMiles = keyboard.nextInt();
//            totalMiles += userMiles;
//            System.out.print("Enter your gallon per trip: ");
//            userGallon = keyboard.nextInt();
//            totalGallon += userGallon;
//            if (userMiles <= 0 || userGallon <= 0){
//                System.out.println(" ");
//                System.out.println("Invalid Input..!!!");
//                float combineTotal = (float) totalMiles / totalGallon;
//                System.out.print("The combined total Miles and the total gallon is: " + combineTotal);
//                break;
//            }
//            float gasUsed = (float) userMiles / userGallon;
//            System.out.println("The miles per gallon is: "+ gasUsed);
//            System.out.println(" ");
//        }

    }
    private int userMiles, userGallon;
    private float combineTotal;
    public GasMileage(int userMiles, int userGallon){
        if (userMiles <= 0) this.userMiles = 0;
        else this.userMiles = userMiles;
        if (userGallon <= 0) this.userGallon = 0;
        else this.userGallon = userGallon;
    }
    public void milesTrip(int userMiles) {
        if (userMiles <= 0) this.userMiles = 0;
        else this.userMiles = userMiles;
    }
    public int getMilesTrip(){
        return userMiles;
    }

    public void gallonTrip(int userGallon) {
        if (userGallon <= 0) this.userGallon = 0;
        else this.userGallon = userGallon;
    }
    public int getGallonUsed(){
        return userGallon;
    }

   public void milesPerGallonTrip(int userMiles, int userGallon){
        if (userMiles <= 0) this.userMiles = 0;
        else if (userGallon <= 0) this.userGallon = 0;
        else combineTotal = (float) userMiles / userGallon;
   }
   public float getCombineTotal(){
        return combineTotal;
   }
}
