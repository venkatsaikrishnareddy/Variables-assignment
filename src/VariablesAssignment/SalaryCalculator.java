package VariablesAssignment;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Declare Hima's basic salary and other percentages
        double basicSalary = 85000;
        double taRate = 15; // 15% TA
        double hraRate = 18; // 18% HRA
        double pfRate = 20; // 20% PF
        double taxRate = 25; // 25% Tax

        // Calculate TA, HRA
        double taAmount = (basicSalary * taRate) / 100;
        double hraAmount = (basicSalary * hraRate) / 100;

        // Calculate Gross Salary
        double grossSalary = basicSalary + taAmount + hraAmount;

        // Calculate PF and Tax
        double pfAmount = (basicSalary * pfRate) / 100;
        double taxAmount = (basicSalary * taxRate) / 100;

        // Calculate Net Salary (Gross Salary - PF - Tax)
        double netSalary = grossSalary - pfAmount - taxAmount;

        // Output the results
        System.out.println("Hima's Gross Salary: ₹" + grossSalary);
        System.out.println("Hima's Net Salary: ₹" + netSalary);
    }
}
