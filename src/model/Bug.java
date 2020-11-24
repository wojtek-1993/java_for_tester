package model;

public class Bug {

    private String descriptionOfBug;
    private String emailReporter;
    private int priorityOfBug;
    private boolean statusOfBug;

    public Bug(String descriptionOfBug, String emailReporter, int priorityOfBug, boolean statusOfBug) {
        this.descriptionOfBug = descriptionOfBug;
        this.emailReporter = emailReporter;
        this.priorityOfBug = priorityOfBug;
        this.statusOfBug = statusOfBug;
    }

    public String getDescriptionOfBug() {
        return descriptionOfBug;
    }

    public void setDescriptionOfBug(String descriptionOfBug) {
        if(descriptionOfBug.length() < 10){
            System.out.println("The bug description is less than 10 characters long!");
        }else{
            this.descriptionOfBug = descriptionOfBug;
        }

    }

    public String getEmailReporter() {
        return emailReporter;
    }

    public void setEmailReporter(String emailReporter) {
        if(emailReporter.contains("@")){
            this.emailReporter = emailReporter;
        }else{
            System.out.println("Email doesn't contain the @ character!");


        }

    }

    public int getPriorityOfBug() {
        return priorityOfBug;
    }

    public void setPriorityOfBug(int priorityOfBug) {
        if(priorityOfBug >= 1 && priorityOfBug <= 5){
            this.priorityOfBug = priorityOfBug;
        }else{
            System.out.println("The priority of bug isn't in the range from 1 to 5!");
        }

    }

    public boolean isStatusOfBug() {
        return statusOfBug;
    }

    public void setStatusOfBug(boolean statusOfBug) {
        this.statusOfBug = statusOfBug;
    }

    public void allInformationAboutBug() {
        System.out.println("model.Bug description: " + descriptionOfBug + ", " + "Email reporter: " + emailReporter + ", " + "Priority of bug: " + priorityOfBug + ", " + "Status of bug: " + statusOfBug + ".");
    }

    public void returnEmailReporter() {
        System.out.println("Email reporter : " + emailReporter);
    }

    public void returnStatusOfBug() {
        System.out.println("Status of bug is: " + statusOfBug);

    }

    public int returnPriorityOfBug() {
        return priorityOfBug;

    }

}
