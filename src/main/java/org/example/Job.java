
package org.example;

public class Job {

    // Job application details
    private String companyName;
    private String jobTitle;
    private String jobLink;
    private String status;
    private String appliedDate;
    private boolean resumeSubmitted;

    // Constructor
    public Job(String companyName, String jobTitle,
               String jobLink, String status,
               String appliedDate, boolean resumeSubmitted) {

        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobLink = jobLink;
        this.status = status;
        this.appliedDate = appliedDate;
        this.resumeSubmitted = resumeSubmitted;
    }

    // Getters
    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobLink() {
        return jobLink;
    }

    public String getStatus() {
        return status;
    }

    public String getAppliedDate() {
        return appliedDate;
    }

    public boolean isResumeSubmitted() {
        return resumeSubmitted;
    }

    // Display job details
    @Override
    public String toString() {
        return "Company: " + companyName +
                "\nJob Title: " + jobTitle +
                "\nJob Link: " + jobLink +
                "\nStatus: " + status +
                "\nApplied Date: " + appliedDate +
                "\nResume Submitted: " +
                (resumeSubmitted ? "Yes" : "No");
    }
}
