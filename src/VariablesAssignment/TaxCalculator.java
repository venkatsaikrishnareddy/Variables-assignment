package VariablesAssignment;

public class TaxCalculator {
    public static void main(String[] args) {
        // Declare salary and tax rate
        double salary = 85000;
        double taxRate = 20; // 20%

        // Calculate tax amount
        double taxAmount = (salary * taxRate) / 100;

        // Display the tax amount
        System.out.println("Mr. Vikram's Tax Amount: ₹" + taxAmount);
    }
}

