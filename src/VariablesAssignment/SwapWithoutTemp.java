package VariablesAssignment;

import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First number: q" + a);
        System.out.println("Second number: t" + b);

        // Swapping without using a temporary variable
        a = a + b; // Step 1: Add both numbers
        b = a - b; // Step 2: Subtract num2 from the sum to get the original num1
        a = a - b; // Step 3: Subtract the new num2 from the sum to get the original num2

        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
    }
}

