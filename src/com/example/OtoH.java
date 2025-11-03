package com.example;

import java.util.Scanner;

public class OtoH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int octalNumber = sc.nextInt();
        sc.close();

        // --- Step 1: Convert octal to decimal ---
        int decimalNumber = 0;
        int power = 0;
        int tempOctal = octalNumber;

        while (tempOctal != 0) {
            int digit = tempOctal % 10;
            decimalNumber += digit * Math.pow(8, power);
            tempOctal /= 10;
            power++;
        }

        // --- Step 2: Convert decimal to hexadecimal ---
        char[] hexChars = new char[100]; // Array to store hex characters
        int index = 0;
        int tempDecimal = decimalNumber;

        if (tempDecimal == 0) {
            System.out.println("Hexadecimal equivalent: 0");
            return;
        }

        while (tempDecimal > 0) {
            int remainder = tempDecimal % 16;
            char hexDigit;
            if (remainder < 10) {
                hexDigit = (char) (remainder + '0'); // Convert 0-9 to character '0'-'9'
            } else {
                hexDigit = (char) (remainder - 10 + 'A'); // Convert 10-15 to character 'A'-'F'
            }
            hexChars[index] = hexDigit;
            tempDecimal /= 16;
            index++;
        }

        System.out.print("Hexadecimal equivalent: ");
        // Print the hex characters in reverse order
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(hexChars[i]);
        }
        System.out.println();
    }
}

