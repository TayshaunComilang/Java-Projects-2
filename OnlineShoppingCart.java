//Comilang, Tayshaun M.
//CICTS 1N-A

package com.mycompany.onlineshoppingcart;
import javax.swing.*;

// Custom exception class for handling invalid product quantity
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

public class OnlineShoppingCart {
    public static void main(String[] args) {
        // Initial available stock
        int availableStock = 90;

        try {
            //Prompt user for quantity to purchase
            String input = JOptionPane.showInputDialog("Enter the quantity to purchase:");
            
            //Handle cancellation
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operation canceled.");
                return;
            }
            
            //Parse input to a numeric value
            int quantity = Integer.parseInt(input);

            //Check for negative quantity
            if (quantity < 0) {
                throw new InvalidQuantityException("Quantity cannot be negative.");
            //Check for quantity exceeding available stock
            } else if (quantity > availableStock) {
                throw new InvalidQuantityException("Insufficient stock. Only " + availableStock + " items are available.");
            } else {
                //Deduct the purchased quantity from the stock
                availableStock -= quantity;
                JOptionPane.showMessageDialog(null, "Purchase successful! Remaining stock: " + availableStock);
            }
        } catch (InvalidQuantityException e) {
            //Handle invalid quantity exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            //Handle invalid numeric input
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
        }
    }
}

