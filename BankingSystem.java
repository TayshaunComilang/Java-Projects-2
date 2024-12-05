//Comilang, Tayshaun M.
//CICTS 1N-A

package com.mycompany.bankingsystem;
import javax.swing.*;

// Custom exception class for handling insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        //Initial account balance
        double balance = 90000.0;
        
        try {
            //Prompt user for withdrawal amount
            String input = JOptionPane.showInputDialog("Enter the amount to withdraw:");
            
            // Handle cancellation
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operation canceled.");
                return;
            }
            
            //Parse input to a numeric value
            double amount = Double.parseDouble(input);

            //Check for insufficient funds
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds. Your current balance is P" + balance);
            //Check for invalid input (negative or zero values)
            } else if (amount <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a positive value.");
            } else {
                //Deduct the amount from the balance
                balance -= amount;
                JOptionPane.showMessageDialog(null, "Withdrawal successful! New balance: P" + balance);
            }
        } catch (InsufficientFundsException e) {
            // Handle insufficient funds exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            // Handle invalid numeric input
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
        }
    }
}

