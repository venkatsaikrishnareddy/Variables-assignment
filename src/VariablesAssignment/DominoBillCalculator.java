package VariablesAssignment;

import java.util.Scanner;

public class DominoBillCalculator {
    public static void main(String[] args) {
        // Declare the cost of one pizza and the discount rate
        double pizzaCost = 399.0;
        int pizzaQuantity = 2;

        // Get the discount percentage from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the discount percentage offered by Dominos: ");
        double discountRate = scanner.nextDouble();

        // Calculate the total bill before discount
        double totalBill = pizzaCost * pizzaQuantity;

        // Calculate the discount amount
        double discountAmount = (totalBill * discountRate) / 100;

        // Calculate the final bill amount after applying the discount
        double finalBill = totalBill - discountAmount;

        // Output the results
        System.out.println("Total Bill before discount: ₹" + totalBill);
        System.out.println("Discount amount: ₹" + discountAmount);
        System.out.println("Final Bill after discount: ₹" + finalBill);
    }
}

