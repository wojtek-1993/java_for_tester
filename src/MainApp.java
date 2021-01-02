import enums.Gender;
import model.User;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static enums.Gender.*;

public class MainApp {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Jan", "Nowak", "jan.nowak@o2.pl", 28, MALE));
        users.add(new User("Katarzyna", "Przybył", "kasia.przybyl@onet.pl", 39, FEMALE));
        users.add(new User("Paweł", "Kowalczyk", "pablo.kowalczyk@wp.pl", 40, MALE));
        users.add(new User("Piotr", "Maliniak", "piotr.maliniak@gmail.com", 20, MALE));
        users.add(new User("Mariola", "Kruk", "mariola.kruk@interia.pl", 24, FEMALE));
        users.add(new User("Grażyna", "Lorek", "grazyna.lorek@wp.pl", 45, FEMALE));

        List<User> female = users.stream()
                .filter(user -> user.getGender().equals(FEMALE))
                .collect(Collectors.toList());

        for (User user : female) {
            System.out.println(user);
        }

        User user = new User("Grzegorz", "Ptak", "grzegorz.ptak@wp.pl", 17, MALE);
        user.setEmail("jan.kruk@wp.ex");
        System.out.println(user.getEmail());

        try {
            String firstnames = "Jan, Katarzyna, Paweł, Piotr, Mariola, Grażyna";
            FileWriter file = new FileWriter("names.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write(firstnames);
            output.close();
        } catch (FileAlreadyExistsException ex) {
            ex.printStackTrace();
            System.out.println("The file was created!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            List<String> names = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("names.txt"));

            String line = bufferedReader.readLine();
            while (line != null) {
                names.add(line);
                line = bufferedReader.readLine();
            }

            System.out.println(names);

            names.stream()
                    .filter(n -> n.startsWith("B"))
                    .findFirst()
                    .orElseThrow(() -> new IllegalStateException("No firstnames start with letter B"));

        } catch (FileNotFoundException e) {
            System.out.println("The file wasn't found!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
