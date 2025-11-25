package uss;
import java.util.Scanner;

public class evennum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the upper limit
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum += i; // Add even number to sum
            }
        }

        System.out.println("Sum of even numbers up to " + n + " is: " + sum);
    }
}
