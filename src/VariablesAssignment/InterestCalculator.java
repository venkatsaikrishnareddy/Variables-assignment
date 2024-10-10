package VariablesAssignment;

public class InterestCalculator {
    public static void main(String[] args) {
        // Declare the deposit amount, time (in years), and interest rate
        double principal = 500000;
        double rateOfInterest = 6.8; // 6.8%
        int timeInYears = 5; // Time in years

        // Calculate the simple interest
        double interestAmount = (principal * rateOfInterest * timeInYears) / 100;

        // Calculate the final amount after interest
        double finalAmount = principal + interestAmount;

        // Output the interest amount and final amount
        System.out.println("Interest Amount: ₹" + interestAmount);
        System.out.println("Final Amount after " + timeInYears + " years: ₹" + finalAmount);
    }
}
