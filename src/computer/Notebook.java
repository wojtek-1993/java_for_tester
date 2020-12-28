package computer;

public class Notebook extends Computer {

    private int batteryLevel;

    public Notebook(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level!");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level is too low!");
        }
    }

    @Override
    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;
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

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }
}
