public class Bug {

    String descriptionOfBug;
    String emailReporter;
    int priorityOfBug;
    boolean statusOfBug;

    Bug(String descriptionOfBug, String emailReporter, int priorityOfBug, boolean statusOfBug) {
        this.descriptionOfBug = descriptionOfBug;
        this.emailReporter = emailReporter;
        this.priorityOfBug = priorityOfBug;
        this.statusOfBug = statusOfBug;
    }

    void allInformationAboutBug() {
        System.out.println("Bug description: " + descriptionOfBug + ", " + "Email reporter: " + emailReporter + ", " + "Priority of bug: " + priorityOfBug + ", " + "Status of bug: " + statusOfBug + ".");
    }

    void returnEmailReporter() {
        System.out.println("Email reporter : " + emailReporter);
    }

    void returnStatusOfBug() {
        System.out.println("Status of bug is: " + statusOfBug);

    }

    int returnPriorityOfBug() {
        return priorityOfBug;

    }

}
