public class MainApp {

    public static void main(String[] args) {



        model.Bug bug1 = new model.Bug("NullPointerException in the component Document Authentication",
                "jan_testowy@o2.pl", 3, true);

        bug1.allInformationAboutBug();
        bug1.setDescriptionOfBug("Null");
        bug1.setEmailReporter("piotr");
        bug1.setPriorityOfBug(7);
        bug1.allInformationAboutBug();
        //bug1.returnEmailReporter();
        //bug1.returnStatusOfBug();
        //int k = bug1.returnPriorityOfBug();
        //System.out.println(k);

    }
}
