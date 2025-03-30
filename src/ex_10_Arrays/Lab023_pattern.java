package ex_10_Arrays;

import java.util.Scanner;

public class Lab023_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Loop for each row
        for (int i = 0; i < n; i++) {
            // Print spaces for alignment
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars for pyramid
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
