package technology;

import java.util.Scanner;

public class Computer {
    //TODO 3 properties, 2 methods, and a constructor
    private int speed = 0;
    private int memorySize;
    private String computerName;


    public Computer(int speed, int memorySize, String aComputerName) {
        speed = this.speed;
        memorySize = this.memorySize;
        computerName = aComputerName;
    }


    public void changeName() {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to name the computer?");
        String newName = input.nextLine();
        computerName = newName;
        System.out.println("This computer is now named " + newName);
    }

    public void updateComputer() {
        speed = speed + 200;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }
}
