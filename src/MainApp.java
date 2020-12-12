import model.Bug;
import model.BugReporter;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<Bug> bugs = new ArrayList<>();

        bugs.add(new Bug("The method date().ToString() returns NullPointerException", new BugReporter(
                "Jan", "Kowalski", "jan.kowalski@wp.pl"), 3));

        bugs.add(new Bug("Server returns error code 500", new BugReporter(
                "Krzysztof", "Ozimek", "krzysztof@o2pl"), 5));

        bugs.add(new Bug("The page returns error code 404 - Not Found", new BugReporter(
                "Grzegorz", "Kolka", "grzegorz.kolka@gmail.com"), 2));

        bugs.add(new Bug("Server returns error code 500", new BugReporter(
                "Paweł", "Malinowski", "pawel.malinowski@onet.pl"), 1));

        bugs.add(new Bug("File is too large! Server returns error code 1717", new BugReporter(
                "Krystian", "Kasperski", "krystian.kasperski@interia.pl"), 4));

        bugs.add(new Bug("Server returns error code 401 - unauthorized invalid oauth token", new BugReporter(
                "Kazimierz", "Walczyk", "kaz.wal@outlook.com"), 3));

        Set<Bug> sortedBug = new TreeSet<>(bugs);

        for (Bug bug : sortedBug) {
            System.out.println(bug.getDescriptionOfBug() + " -> " + bug.getBugReporter().getFirstName());
        }

        List<Bug> sortedBugs1 = new ArrayList<>(bugs);

        for (Bug bug : sortedBugs1) {
            Collections.sort(bugs, Comparator.comparing(Bug::getDescriptionOfBug));
            System.out.println(bug.getDescriptionOfBug() + ".");

        }
    }
}
