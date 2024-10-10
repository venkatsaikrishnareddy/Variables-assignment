package VariablesAssignment;

public class JioFiberCostCalculator {
    public static void main(String[] args) {
        // Declare the base cost of the plan and GST rate
        double baseCost = 699;
        double gstRate = 18; // 18% GST

        // Calculate the final cost by applying GST
        double gstAmount = (baseCost * gstRate) / 100;
        double finalCost = baseCost + gstAmount;

        // Output the result
        System.out.println("Base cost of the JioFiber Silver Plan: ₹" + baseCost);
        System.out.println("GST (18%): ₹" + gstAmount);
        System.out.println("Final cost of the JioFiber Silver Plan: ₹" + finalCost);
    }
}

