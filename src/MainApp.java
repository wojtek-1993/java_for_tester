import computer.Notebook;
import computer.PC;

public class MainApp {

    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer to work", "Dell", 1000, 4096);
        Notebook laptop = new Notebook("Gaming Laptop", "MSI", 2000, 16384, 0);

        System.out.println(laptop.volumeUp(50));

        System.out.println(laptop.volumeDown(100));

        System.out.println(laptop.volumeUp(6));
        System.out.println(laptop.volumeDown(7));


        //System.out.println(officeComputer.volumeUp(10));

        //System.out.println(officeComputer.volumeDown(5));
        //System.out.println(officeComputer.volumeDown(8));
        //System.out.println(officeComputer.volumeUp(15));

    }
}
