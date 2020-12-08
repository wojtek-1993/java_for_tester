package model;

import java.util.Objects;

public class BugReporter {

    private String firstName;
    private String lastName;
    private String emailReporter;

    public BugReporter(String firstName, String lastName, String emailReporter) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailReporter = validateEmailReporter(emailReporter);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailReporter() {
        return emailReporter;
    }

    public void setEmailReporter(String emailReporter) {
        this.emailReporter = validateEmailReporter(emailReporter);
    }

    private String validateEmailReporter(String newEmailReporter) {
        if (newEmailReporter.contains("@")) {
            return newEmailReporter;
        } else {
            System.out.println("Email doesn't contain the @ character!");
            return this.emailReporter;
        }
    }

    @Override
    public String toString() {
        return "BugReporter{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailReporter='" + emailReporter + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BugReporter that = (BugReporter) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(emailReporter, that.emailReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, emailReporter);
    }
}
