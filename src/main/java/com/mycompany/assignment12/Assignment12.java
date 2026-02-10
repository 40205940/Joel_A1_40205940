/*
 * This program stores average monthly temperatures for the years 2023 and 2024.
 * It calculates the yearly average temperature for each year and allows the user
 * to search for a specific month to view temperature records for both years.
 */

package com.mycompany.assignment12;

import java.util.Scanner;

public class Assignment12 {

    public static void main(String[] args) {

        // Array storing the names of the months
        String[] month = {
            "January", "Febuary", "March", "April", "May", "June",
            "July", "August", "September", "October", "December"
        };

        // Array storing average monthly temperatures for 2023
        int[] temp2023 = {8, 9, 12, 16, 18, 22, 24, 22, 20, 16, 12, 9};

        // Array storing average monthly temperatures for 2024
        int[] temp2024 = {8, 8, 12, 17, 19, 20, 23, 22, 19, 16, 10, 8};

        // -------- Calculate average temperature for 2023 --------
        int total1 = 0;
        int average1 = 0;

        for (int p = 0; p < 12; p++) {
            total1 = total1 + temp2023[p]; // Add each month's temperature
        }

        average1 = total1 / 12; // Compute yearly average
        System.out.println("The average for the year 2023: " + average1);

        // -------- Calculate average temperature for 2024 --------
        int total2 = 0;
        int average2 = 0;

        for (int l = 0; l < 12; l++) {
            total2 = total2 + temp2024[l]; // Add each month's temperature
        }

        average2 = total2 / 12; // Compute yearly average
        System.out.println("The average for the year 2024: " + average2);

        // -------- Search for a specific month's temperature --------
        String lookmonth;
        Scanner inputmonth = new Scanner(System.in);

        // Prompt user to enter a month name
        System.out.println("Enter the name of the month you want to search: ");
        lookmonth = inputmonth.next();

        boolean found = false;

        // Loop through months to find a match
        for (int p = 0; p < 12; p++) {

            // Compare input with month names (ignoring case)
            if (lookmonth.equalsIgnoreCase(month[p])) {

                // Display temperature records for the selected month
                System.out.println("Records for " + month[p] + ":");
                System.out.println("2023 Temp: " + temp2023[p]);
                System.out.println("2024 Temp: " + temp2024[p]);

                found = true;
                break; // Stop loop once month is found
            }
        }

        // If month not found, inform the user
        if (!found) {
            System.out.println("Month not found. Please check the spelling and try again.");
        }

        // Close the scanner
        inputmonth.close();
    }
}
