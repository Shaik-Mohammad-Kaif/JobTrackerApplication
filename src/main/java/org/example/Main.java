
package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Store job applications in memory
        ArrayList<Job> jobList = new ArrayList<>();

        boolean running = true;

        System.out.println("==================================");
        System.out.println("     JOB TRACKER APPLICATION");
        System.out.println("==================================");

        while (running) {

            System.out.println("\n1. Add Job Application");
            System.out.println("2. View All Applications");
            System.out.println("3. Exit");

            System.out.print("\nEnter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    // Get job details from user
                    System.out.print("Company Name: ");
                    String company = scanner.nextLine();

                    System.out.print("Job Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Job Link: ");
                    String link = scanner.nextLine();

                    System.out.print("Application Status: ");
                    String status = scanner.nextLine();

                    System.out.print("Applied Date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();

                    System.out.print("Resume Submitted (yes/no): ");
                    String resumeInput = scanner.nextLine();

                    boolean resumeSubmitted =
                            resumeInput.equalsIgnoreCase("yes");

                    // Create Job object
                    Job job = new Job(
                            company,
                            title,
                            link,
                            status,
                            date,
                            resumeSubmitted
                    );

                    // Add job to list
                    jobList.add(job);

                    System.out.println(
                            "\nJob application added successfully!"
                    );
                    break;

                case "2":
                    // Display all job applications
                    if (jobList.isEmpty()) {
                        System.out.println(
                                "\nNo job applications found."
                        );
                    } else {
                        System.out.println("\n=== YOUR JOB APPLICATIONS ===");

                        for (int i = 0; i < jobList.size(); i++) {
                            System.out.println("\nApplication " + (i + 1));
                            System.out.println(jobList.get(i));
                            System.out.println("----------------------------");
                        }
                    }
                    break;

                case "3":
                    running = false;
                    System.out.println("Thank you for using Job Tracker!");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please select 1, 2, or 3."
                    );
            }
        }

        scanner.close();
    }
}
