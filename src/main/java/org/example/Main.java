
package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("     JOB TRACKER APPLICATION");
        System.out.println("==================================");

        System.out.println();

        // Create a job application object
        Job job1 = new Job(
                "Google",
                "Java Developer",
                "https://careers.google.com",
                "Applied",
                "2026-09-23",
                true
        );

        // Display job details
        System.out.println(job1);

    }
}
