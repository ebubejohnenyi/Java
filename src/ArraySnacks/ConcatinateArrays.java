package ArraySnacks;

public class ConcatinateArrays {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String [] firstArray = new String[3];
//        String [] secondArray = new String [3];
//        String [] arrayHolder = new String [firstArray.length + secondArray.length];
//
//        for (int index = 0; index < firstArray.length; index++){
//            System.out.print("Enter number for first array: ");
//            String userFirstNumber = input.nextLine();
//            firstArray[index] = userFirstNumber;
//            arrayHolder[index] = firstArray[index];
//        }
//        System.out.println(Arrays.toString(firstArray) + "\n ");
//        for (int secondIndex = 0; secondIndex < secondArray.length; secondIndex++) {
//            System.out.print("Enter any name/alphabet for second array: ");
//            String secondNumber = input.nextLine();
//            secondArray[secondIndex] = secondNumber;
//            arrayHolder[secondIndex + firstArray.length] = secondArray[secondIndex];
//        }
//        System.out.println(Arrays.toString(secondArray) + "\n");
//
//        System.out.println(Arrays.toString(arrayHolder));

//    }

    private String [] combine;

    public void setConcatenateArrays(String [] arrayNumber, String [] arrayLetter) {
        String [] combineArray = new String[arrayNumber.length + arrayLetter.length];

        for (int firstIndex = 0; firstIndex < arrayNumber.length; firstIndex++) {
            combineArray[firstIndex] = arrayNumber[firstIndex];
        }
        for (int secondIndex = 0; secondIndex < arrayLetter.length; secondIndex++) {
            combineArray[arrayNumber.length + secondIndex] = arrayLetter[secondIndex];
        }
        combine = combineArray;
    }
    public String [] getCombineArray(){
        return combine;
    }

}
