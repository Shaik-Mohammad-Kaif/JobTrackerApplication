
package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Job> jobs = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== JOB TRACKER =====");
            System.out.println("1. Add Job Application");
            System.out.println("2. View Job Applications");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1:
                    addJob();
                    break;

                case 2:
                    viewJobs();
                    break;

                case 3:
                    System.out.println("Exiting Job Tracker...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addJob() {
        System.out.print("Company Name: ");
        String company = scanner.nextLine();

        System.out.print("Job Title: ");
        String title = scanner.nextLine();

        System.out.print("Job Application Link: ");
        String link = scanner.nextLine();

        System.out.print("Application Status: ");
        String status = scanner.nextLine();

        System.out.print("Resume Submitted? (yes/no): ");
        boolean resumeSubmitted =
                scanner.nextLine().equalsIgnoreCase("yes");

        Job job = new Job(
                company, title, link, status, resumeSubmitted
        );

        jobs.add(job);

        System.out.println("Job application added successfully!");
    }

    private static void viewJobs() {
        if (jobs.isEmpty()) {
            System.out.println("No job applications found.");
            return;
        }

        System.out.println("\n===== YOUR JOB APPLICATIONS =====");

        for (int i = 0; i < jobs.size(); i++) {
            Job job = jobs.get(i);

            System.out.println("\nApplication #" + (i + 1));
            System.out.println("Company: " + job.getCompanyName());
            System.out.println("Job Title: " + job.getJobTitle());
            System.out.println("Link: " + job.getJobLink());
            System.out.println("Status: " + job.getStatus());
            System.out.println("Resume Submitted: "
                    + (job.isResumeSubmitted() ? "Yes" : "No"));
        }
    }
}