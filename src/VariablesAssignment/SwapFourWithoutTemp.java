package VariablesAssignment;

import java.util.Scanner;

public class SwapFourWithoutTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input four numbers from the user
        System.out.print("Enter the first number10: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter the fourth number: ");
        int num4 = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Fourth number: " + num4);

        // Swapping without using a temporary variable
        // Swap num1 with num2
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        // Swap num3 with num4
        num3 = num3 + num4;
        num4 = num3 - num4;
        num3 = num3 - num4;

        // Swap num1 with num3
        num1 = num1 + num3;
        num3 = num1 - num3;
        num1 = num1 - num3;

        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Fourth number: " + num4);
    }

}
