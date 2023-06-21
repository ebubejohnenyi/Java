package ChapterFive;

public class SumSeries {
    public static void main(String[] args) {
        long product = 0;
        for (long index = 1; index <= 100; index++) {
            System.out.println(index);
            int result = 0;
            result += index;
            product = result * index;
        }
        System.out.println("The summation of the product is: " +product);
    }
}
