package BSIT2ndSem.Joption;

import javax.swing.*;

public class Gui {

    public static void main(String[] args) {
        String firstInput = JOptionPane.showInputDialog("Enter first number: ");
        String secondInput = JOptionPane.showInputDialog("Enter second number: ");

        double firstNumber = Double.parseDouble(firstInput);
        double secondNumber = Double.parseDouble(secondInput);

        double totalSum = firstNumber + secondNumber;
        double totalDifference = firstNumber - secondNumber;
        double totalProduct = firstNumber * secondNumber;
        double totalQuotient = firstNumber / secondNumber;

        JOptionPane.showMessageDialog(null,
                "Sum: " + totalSum
                + "\nDifference: " + totalDifference
                + "\nProduct: " + totalProduct
                + "\nQuotient: " + totalQuotient);

        System.exit(0);
    }
}
