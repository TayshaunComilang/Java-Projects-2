// Comilang, Tayshaun M.

package com.mycompany.joptiondrill;
import javax.swing.JOptionPane;
public class JOptionDrill {

    public static void main(String[] args) {
        try {
            
            //Collect two numbers from the user
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number;"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number;"));
            
            //Perform addition and display result
            double result = num1 + num2;
            JOptionPane.showMessageDialog(null, "The result is: " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (NumberFormatException e) {
            
            //Handle invalid input
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
