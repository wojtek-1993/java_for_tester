package computer;

import java.util.Objects;

abstract public class Computer {

    protected String name;
    protected String type;
    protected boolean state;
    protected int volumeLevel;
    protected Hdd hdd;
    protected Ram ram;

    public Computer(String name, String type, Hdd hdd, Ram ram) {
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

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return state == computer.state &&
                volumeLevel == computer.volumeLevel &&
                Objects.equals(name, computer.name) &&
                Objects.equals(type, computer.type) &&
                Objects.equals(hdd, computer.hdd) &&
                Objects.equals(ram, computer.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, state, volumeLevel, hdd, ram);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", state=" + state +
                ", volumeLevel=" + volumeLevel +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }
}
