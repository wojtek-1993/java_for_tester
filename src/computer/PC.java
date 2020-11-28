package computer;

public class PC extends Computer {

    private boolean chargeWithElectricity;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        this.chargeWithElectricity = false;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply!");
        if (chargeWithElectricity == true) {
            super.switchOn();
        } else {
            System.out.println("PC isn't charged with electricity!");
        }
    }

    public void connectTheComputerToElectricity(boolean newChargeWithElectricity) {
        chargeWithElectricity = newChargeWithElectricity;
    }
}
