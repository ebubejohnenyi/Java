package ChapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N" + "    N2" + "   N3" + "   N4");
        for (int index = 1; index <= 5; index++) {
            int firstColumn = index * index;
            System.out.print( index  + "    " + firstColumn + "    ");
            int secondColumn = index * firstColumn;
            System.out.print(secondColumn + "    ");
            int thirdColumn = index * secondColumn;
            System.out.println(thirdColumn);
        }
    }
}
