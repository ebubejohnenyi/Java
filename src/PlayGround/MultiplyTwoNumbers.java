package PlayGround;

public class MultiplyTwoNumbers {
    private int sum = 0;

    public void twoNumber(int firstNumber, int secondNumber) {
        for (int index = 0; index < firstNumber; index++) {
            sum += secondNumber;
        }
    }

    public int getSum() {
        return sum;
    }
}
