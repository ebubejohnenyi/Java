package PlayGround;

public class PracticeNumberReversal {
    public static void main(String[] args) {
        int numbers = 12345, reversal = 0;
        while (numbers != 0) {
            int digit = numbers % 10;
            numbers /=10;
            reversal = reversal * 10 + digit;
        }
        System.out.println("The reverse is: " + reversal);
    }
}
