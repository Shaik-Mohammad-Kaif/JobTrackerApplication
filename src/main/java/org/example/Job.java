
package org.example;

public class Job {
    private String companyName;
    private String jobTitle;
    private String jobLink;
    private String status;
    private boolean resumeSubmitted;

    public Job(String companyName, String jobTitle,
               String jobLink, String status,
               boolean resumeSubmitted) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobLink = jobLink;
        this.status = status;
        this.resumeSubmitted = resumeSubmitted;
    }

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

    public boolean isResumeSubmitted() {
        return resumeSubmitted;
    }
}