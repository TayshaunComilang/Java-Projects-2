//Comilang, Tayshaun M.
//CITCS 1N-A

package com.mycompany.retailstore;
import java.util.Scanner;
import java.util.ArrayList;
public class RetailStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Declare arrys for product quantities and prices
        int[] stockQuantities = new int[10];
        double[] productPrices = new double[10];
        double totalValue = 0, highestValue = 0, lowestValue = Double.MAX_VALUE, productValue;
        int highestIndex = 0, lowestIndex = 0;
        
        //Collect stock quantities and prices for each product
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter quantity for product " + (i + 1) + ": ");
            stockQuantities[i] = scanner.nextInt();
            
            System.out.println("Enter price for product " + (i + 1) + ": ");
            productPrices[i] = scanner.nextDouble();
        }
        
        //Calculate total value of stock
        for (int i = 0; i < 10; i++) {
            totalValue += stockQuantities[i] * productPrices[i];
        }
        
        //Display the total value of stock
        System.out.println("Total value of all products in stock: P" + totalValue);
        
        //Find the product with the highest and lowest total value
        for (int i = 0; i < 10; i++) {
            productValue = stockQuantities[i] * productPrices[i];
            if (productValue > highestValue) {
                highestValue = productValue;
                highestIndex = i;
            }
            if (productValue > lowestValue){
                lowestValue = productValue;
                lowestIndex = i;
            }
        }
        
        //Display the product with higest and lowest stock value
        System.out.println("Product with highest stock value: Product " + (highestIndex + 1) + " (P" + highestValue + ")");
        System.out.println("Product with lowest stock value: Product " + (lowestIndex + 1) + " (P" + lowestValue + ")");
        
        scanner.close();
        
    }  
}
