package app;
import java.util.Scanner;
public class WeekdayFinder {

        public static void main(String[] args) {
            // Array to store the names of the weekdays
            String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            // Scanner object for reading user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a day position
            System.out.println("Enter the day position (0-6): ");

            try {
                // Read the user input
                int dayIndex = scanner.nextInt();

                // Print the day name
                System.out.println("The day is: " + weekdays[dayIndex]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle the exception if the index is out of range
                System.out.println("Error: Please enter a valid day index between 0 and 6.");
            } finally {
                // Close the scanner
                scanner.close();
            }
        }
    }

