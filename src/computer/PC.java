package computer;

public class PC extends Computer {

    private boolean chargeWithElectricity;

    public PC(String name, String type, Hdd hdd, Ram ram) {
        super(name, type, hdd, ram);
        this.chargeWithElectricity = false;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply!");
        if (chargeWithElectricity) {
            super.switchOn();
        } else {
            System.out.println("PC isn't charged with electricity!");
        }
    }

    @Override
    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeUp(int volume) {
        volumeLevel += volume;
        if (volumeLevel >= 100) {
            System.out.println("The maximum value of volume is equaled 100!");
            return volumeLevel = 100;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int volume) {
        volumeLevel -= volume;
        if (volumeLevel <= 0) {
            System.out.println("The minimum value of volume is equaled 0!");
            return volumeLevel = 0;
        } else {
            return volumeLevel;
        }
    }

    public void connectTheComputerToElectricity(boolean newChargeWithElectricity) {
        chargeWithElectricity = newChargeWithElectricity;
    }
}
