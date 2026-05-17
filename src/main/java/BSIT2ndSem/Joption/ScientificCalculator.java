import javax.swing.*;
import java.awt.*;

public class ScientificCalculator {
    public static void main(String[] args) {
        // 1. Create the UI components that will live inside the JOptionPane
        JTextField inputField = new JTextField(10);
        inputField.setFont(new Font("Monospaced", Font.BOLD, 20));
        
        // Labels to show the current state
        JLabel statusLabel = new JLabel("Enter a number and choose an operator:");
        JLabel resultLabel = new JLabel("Current Result: 0.0000");
        resultLabel.setForeground(Color.BLUE);

        // 2. Arrange them in a panel
        JPanel customPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        customPanel.add(resultLabel);
        customPanel.add(statusLabel);
        customPanel.add(inputField);

        // 3. Define the scientific buttons (these become the JOptionPane options)
        String[] options = {"+", "-", "*", "/", "x^y", "sqrt", "sin", "log", "Clear", "Exit"};
        
        double result = 0;
        boolean isNewCalculation = true;

        while (true) {
            // Show the dialog. We pass 'customPanel' as the message.
            int choice = JOptionPane.showOptionDialog(
                    null, 
                    customPanel, 
                    "Java Sci-Calc", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.PLAIN_MESSAGE, 
                    null, 
                    options, 
                    options[0]);

            // Handle Exit or closing the window
            if (choice == -1 || options[choice].equals("Exit")) break;

            // Handle Clear
            if (options[choice].equals("Clear")) {
                result = 0;
                isNewCalculation = true;
                inputField.setText("");
                resultLabel.setText("Current Result: 0.0000");
                continue;
            }

            try {
                // Get the value from the typing area
                double currentInput = Double.parseDouble(inputField.getText());

                // Perform the math based on which button was clicked
                switch (options[choice]) {
                    case "+": result = isNewCalculation ? currentInput : result + currentInput; break;
                    case "-": result = isNewCalculation ? currentInput : result - currentInput; break;
                    case "*": result = isNewCalculation ? currentInput : result * currentInput; break;
                    case "/": 
                        if (currentInput == 0) throw new ArithmeticException("Div by 0");
                        result /= currentInput; 
                        break;
                    case "x^y": result = Math.pow(result, currentInput); break;
                    case "sqrt": result = Math.sqrt(currentInput); break;
                    case "sin": result = Math.sin(Math.toRadians(currentInput)); break;
                    case "log": result = Math.log10(currentInput); break;
                }

                // Update the UI inside the loop
                isNewCalculation = false;
                resultLabel.setText("Current Result: %.4f".formatted(result));
                inputField.setText(""); // Clear the box for the next number
                inputField.requestFocus(); // Keep focus on the typing area

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Math Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}