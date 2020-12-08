import model.Bug;
import model.BugReporter;

public class MainApp {

    public static void main(String[] args) {


        BugReporter bugReporter = new BugReporter("jan", "kowalski", "jan.kowalski@wp.pl");
        Bug bug1 = new Bug("Server returns error code 500", bugReporter, 6);

        //bugReporter.setEmailReporter("jan.nowak@wp.pl");

        System.out.println(bug1);

        bug1.setStatusOfBug(true);

        System.out.println(bug1);
    }
}
