package ChapterFive;

public class Bar_ChartPrinting {
    public static void main(String[] args) {
        for (int index = 1; index <= 30; index++) {
            if(index < 5){
                for (int secondIndex = index; secondIndex <= 5; secondIndex++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
