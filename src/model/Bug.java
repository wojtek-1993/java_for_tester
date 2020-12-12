package model;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {

    private String descriptionOfBug;
    private int priorityOfBug;
    private boolean statusOfBug;
    private BugReporter bugReporter;

    public Bug(String descriptionOfBug, BugReporter bugReporter, int priorityOfBug) {
        this.descriptionOfBug = descriptionOfBug;
        this.bugReporter = bugReporter;
        this.priorityOfBug = priorityOfBug;
        this.statusOfBug = false;
    }

    public String getDescriptionOfBug() {
        return descriptionOfBug;
    }

    public void setDescriptionOfBug(String descriptionOfBug) {
        if (descriptionOfBug.length() < 10) {
            System.out.println("The bug description is less than 10 characters long!");
        } else {
            this.descriptionOfBug = descriptionOfBug;
        }

    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public int getPriorityOfBug() {
        return priorityOfBug;
    }

    public void setPriorityOfBug(int priorityOfBug) {
        if (priorityOfBug >= 1 && priorityOfBug <= 5) {
            this.priorityOfBug = priorityOfBug;
        } else {
            System.out.println("The priority of bug isn't in the range from 1 to 5!");
        }

    }

    public boolean isStatusOfBug() {
        return statusOfBug;
    }

    public void setStatusOfBug(boolean statusOfBug) {
        notifyStatusChange();
        this.statusOfBug = statusOfBug;
    }


    public void returnStatusOfBug() {
        System.out.println("Status of bug is: " + statusOfBug);

    }

    public int returnPriorityOfBug() {
        return priorityOfBug;

    }

    @Override
    public void notifyStatusChange() {
        System.out.println("*** Status of Bug has changed ! ***");
    }

    @Override
    public String toString() {
        return "Bug{" +
                "descriptionOfBug='" + descriptionOfBug + '\'' +
                ", priorityOfBug=" + priorityOfBug +
                ", statusOfBug=" + statusOfBug +
                ", bugReporter=" + bugReporter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return priorityOfBug == bug.priorityOfBug &&
                statusOfBug == bug.statusOfBug &&
                descriptionOfBug.equals(bug.descriptionOfBug) &&
                bugReporter.equals(bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descriptionOfBug, priorityOfBug, statusOfBug, bugReporter);
    }

    @Override
    public int compareTo(Bug bug) {
       int compareResult = this.getDescriptionOfBug().compareTo(bug.getDescriptionOfBug());
       if (compareResult == 0) {
           compareResult = this.getBugReporter().getFirstName().compareTo(bug.getBugReporter().getFirstName());
       }
       return compareResult;
    }
}
