import computer.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new PC("Computer 1", "PRO 1", new Hdd("HP", 1000),
                new Ram("Corsair", 4096)));
        computers.add(new PC("Computer 2", "PRO 2", new Hdd("Samsung", 2000),
                new Ram("Geil", 8192)));
        computers.add(new PC("Computer 3", "PRO 3", new Hdd("Toshiba", 256),
                new Ram("Kingston", 2048)));
        computers.add(new PC("Computer 4", "PRO 4", new Hdd("Seagate", 500),
                new Ram("G.Skill", 1024)));
        computers.add(new Notebook("MSI", "Model 1", new Hdd("Samsung", 1000),
                new Ram("GOODRAM", 2048), 100));
        computers.add(new Notebook("ASUS", "Model 2", new Hdd("Toshiba", 500),
                new Ram("HyperX", 16384), 80));
        computers.add(new Notebook("ACER", "Model 3", new Hdd("Samsung", 256),
                new Ram("AMD", 8192), 60));
        computers.add(new Notebook("DELL", "Model 4", new Hdd("Seagate", 2000),
                new Ram("Patriot", 4096), 40));

        System.out.println("---Zliczyć wszystkie komputery, które mają więcej niż 4096 MB RAM---");
        // 1. Zliczyć wszystkie komputery, które mają więcej niż 4096 MB RAM
        long count = computers.stream()
                .filter(comp -> comp.getRam().getSize() > 4096)
                .count();

        System.out.println(count);

        System.out.println("---Wyświetlić na konsolę wszystkie typy komputerów---");

        // 2. Wyświetlić na konsolę wszystkie typy komputerów -map
        computers.stream()
                .map(Computer::getType)
                .forEach(System.out::println);

        System.out.println("---Wyświetlić komputer, który ma najwięcej Ramu---");

        // 3. Wyświetlić komputer, który ma najwięcej Ramu

        Computer computer = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("Can't find any computer"));

        System.out.println(computer.getName());


        System.out.println("---Utworzyć nową kolekcję z komputerami, które mają dysk twardy mniejszy niż 500 GB---");

        // 4. Utworzyć nową kolekcję z komputerami, które mają dysk twardy mniejszy niż 500 GB
        List<Computer> collectList = computers.stream()
                .filter(comp -> comp.getHdd().getSize() < 500)
                .collect(Collectors.toList());

        for (Computer comp : collectList) {
            System.out.println(comp.getName() + " " + comp.getHdd());

        }

        System.out.println("---Posortować computery po nazwie i po typie---");
        // 5. Posortować computery po nazwie i po typie

        List<Computer> sortedList = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        for (Computer comp : sortedList) {
            System.out.println(comp.getName() + " " + comp.getType());
        }

        // 6. Przećwiczyć optional
        // get()
        // isPresent()
        // isEmpty()
        // orElse()
        // orElseGet()
        // orElseThrow()
        // isPresent()
        // isPresentOrElse()
    }
}
