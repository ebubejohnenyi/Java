package PersonalExercise;

public class Calculator {
    private int result;
    public void addition(int firstNumber, int secondNumber){
        result = firstNumber + secondNumber;
    }
    public int result(){
        return result;
    }
    public void subtraction(int firstNumber, int secondNumber){
        if(firstNumber > secondNumber)result = firstNumber - secondNumber;
        else result = secondNumber - firstNumber;
    }
    public void division(int firstNumber, int secondNumber){
    result = firstNumber / secondNumber;
    }
}
