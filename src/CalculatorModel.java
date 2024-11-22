public class CalculatorModel {
    private int result;

    public void addTwoNumbers(int firstNumber, int secondNumber) {
        result = firstNumber + secondNumber;
    }

    public int getResult() {
        return result;
    }
}