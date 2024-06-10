package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class StudentGrades {
        private Map<String, Integer> studentGrades;

        // Constructor to initialize the HashMap
        public StudentGrades() {
            studentGrades = new HashMap<>();
        }

        // Method to add a new student
        public void addStudent(String name, int grade) {
            studentGrades.put(name, grade);
            System.out.println("Student " + name + " added with grade " + grade + ".");
        }

        // Method to remove a student
        public void removeStudent(String name) {
            if (studentGrades.containsKey(name)) {
                studentGrades.remove(name);
                System.out.println("Student " + name + " removed.");
            } else {
                System.out.println("Student " + name + " not found.");
            }
        }

        // Method to display a student's grade by name
        public void displayGrade(String name) {
            if (studentGrades.containsKey(name)) {
                int grade = studentGrades.get(name);
                System.out.println("Grade for student " + name + " is: " + grade);
            } else {
                System.out.println("Student " + name + " not found.");
            }
        }

        // Main method for testing
        public static void main(String[] args) {
            StudentGrades sg = new StudentGrades();
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n1. Add Student");
                System.out.println("2. Remove Student");
                System.out.println("3. Display Student Grade");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter student grade: ");
                        int grade = scanner.nextInt();
                        sg.addStudent(name, grade);
                        break;
                    case 2:
                        System.out.print("Enter student name to remove: ");
                        String removeName = scanner.nextLine();
                        sg.removeStudent(removeName);
                        break;
                    case 3:
                        System.out.print("Enter student name to display grade: ");
                        String displayName = scanner.nextLine();
                        sg.displayGrade(displayName);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 4);

            scanner.close();
        }
    }

