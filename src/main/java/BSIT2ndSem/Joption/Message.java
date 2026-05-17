package BSIT2ndSem.Joption;

import javax.swing.JOptionPane;

public class Message {

    public static void main(String[] args) {
        String Fname = JOptionPane.showInputDialog(null, "Anong Pangalan Mo?");

        // Try replacing the line below with one of the formatting methods above!
        JOptionPane.showMessageDialog(null, "Hi " + Fname + "!");
        JOptionPane.showConfirmDialog(null,"Sure kaba?");
        JOptionPane.showMessageDialog(null, "Omke");
        System.exit(0);
    }
}
