import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        this.view.addCalculationListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;

            try {
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();

                model.addTwoNumbers(firstNumber, secondNumber);
                view.setResult(model.getResult());

            } catch (NumberFormatException ex) {
                view.setResult(0);
                JOptionPane.showMessageDialog(view, "Please enter valid numbers.");
            }
        }
    }
}
