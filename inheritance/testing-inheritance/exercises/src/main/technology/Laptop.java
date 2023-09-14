package technology;

public class Laptop extends Computer{
    //TODO at least 1 additional property and 1 additional method
    private boolean isWorkLaptop = false;

    public Laptop(int speed, int memorySize, String computerName) {
        super(speed, memorySize, computerName);
    }

    public void makeWorkLaptop() {
        isWorkLaptop = true;
    }
}
