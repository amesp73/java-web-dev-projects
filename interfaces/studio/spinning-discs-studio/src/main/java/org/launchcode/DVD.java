package org.launchcode;

public class DVD extends BaseDisc {
    // TODO: Implement your custom interface.
    double time;

    public DVD(String name, Double storageCapacity, String discType, int spinSpeed, double time) {
        super(name, storageCapacity, discType, spinSpeed);
        this.time = time;
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    @Override
    public void spinDisc() {
        System.out.println("The disc is spinning!");
    }

    @Override
    public String readDisc() {
        return "Reading disc...";
    }

    @Override
    public void writeDisc() {
        System.out.println("The disc is being written!");
    }

    @Override
    public void reportData() {
        System.out.println("Name: " + getName());
        System.out.println("Storage Capacity: " + getStorageCapacity() + "MB");
        System.out.println("Disc Type: " + getDiscType());
        System.out.println("Spin Speed: " + getSpinSpeed());
        System.out.println("Amount of time: " + getTime() + " hours");
    }

    public double getTime() {
        return time;
    }
}
