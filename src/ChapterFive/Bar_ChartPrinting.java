package ChapterFive;

public class Bar_ChartPrinting {
    public static void main(String[] args) {
        for (int index = 1; index <= 30; index++) {
            if(index <= 5){
                for (int counter = 1; counter <= index; counter++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
