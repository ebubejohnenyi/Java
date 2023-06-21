package ChapterFive;

public class NumberDivisibleByThree {
    // TODO: I DON'T UNDERSTAND THE QUESTION.
    public static void main(String[] args) {
        int sum = 0;
        for (int index = 0; index < 30; index++) {
            if(index % 3 == 0){
                System.out.println(index);
                sum+= index;
            }
        }
        System.out.println("The summation of the series is "+sum);
    }
}
