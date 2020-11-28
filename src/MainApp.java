import computer.Notebook;
import computer.PC;

public class MainApp {

    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer to work", "Dell", 1000, 4096);
        Notebook laptop = new Notebook("Gaming Laptop", "MSI", 2000, 16384, 0);

        laptop.switchOn();
        System.out.println(laptop.getState());

        laptop.setBatteryLevel(60);
        laptop.switchOn();
        System.out.println(laptop.getState());

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        officeComputer.connectTheComputerToElectricity(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

    }
}
