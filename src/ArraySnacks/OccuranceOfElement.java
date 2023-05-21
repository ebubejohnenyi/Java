package ArraySnacks;

public class OccuranceOfElement {
 
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int [] numberArray = {1,2,3,4,5};
//
//        System.out.print("Enter a number (1 - 5): ");
//        int userNumber = input.nextInt();
//        boolean isUserNumberFound = false;
//        int index = 0;
//        for (; index < numberArray.length; index++) {
//            if(userNumber == numberArray[index]) {
//                isUserNumberFound = true;
//                break;
//            }
//        }
//        if(isUserNumberFound){
//            System.out.println("Found input " + userNumber + " at index " + numberArray[index] + " of array");
//        }else System.out.println(Arrays.toString(numberArray));
//    }

    private boolean tracker = false;
    public void setOccurredElement(int [] arrayElement, int [] checkOccurredArrayHere) {
        for (int index = 0; index < checkOccurredArrayHere.length; index++) {
            if(arrayElement[index] == checkOccurredArrayHere[index]){
                tracker = true;
            }
        }
        if(tracker){
            System.out.println("This number occurs in the array.");
        }
        else System.out.println("This number doesn't occur in the array.");
    }

}
