// CalculatorView.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField result = new JTextField(10);

    public CalculatorView() {
        JPanel panel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 150);

        panel.add(new JLabel("First Number:"));
        panel.add(firstNumber);
        panel.add(new JLabel("Second Number:"));
        panel.add(secondNumber);
        panel.add(calculateButton);
        panel.add(new JLabel("Result:"));
        panel.add(result);

        this.add(panel);
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public int getResult() {
        return Integer.parseInt(result.getText());
    }

    public void setResult(int resultValue) {
        result.setText(Integer.toString(resultValue));
    }

    public void addCalculationListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }
}
