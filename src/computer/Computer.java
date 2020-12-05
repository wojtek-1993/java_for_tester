package computer;

abstract public class Computer {

    protected String name;
    protected String type;
    protected int hdd;
    protected int ram;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, int hdd, int ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void switchOn() {
        System.out.println("PC or Laptop is charged to electricity!");
        state = true;
    }

    public void switchOff() {
        state = false;
    }

    public boolean getState() {
        return state;
    }

    public abstract int volumeUp();

    public abstract int volumeDown();

    public abstract int volumeUp(int volume);

    public abstract int volumeDown(int volume);
}
