public class MainApp {

    public static void main(String[] args) {

        Bug bug1 = new Bug("NullPointerException in the component Document Authentication", "jan_testowy@o2.pl", 3, true);

        bug1.allInformationAboutBug();
        bug1.returnEmailReporter();
        bug1.returnStatusOfBug();
        int k = bug1.returnPriorityOfBug();
        System.out.println(k);

    }
}
