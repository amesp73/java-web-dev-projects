package org.launchcode;

public class CD extends BaseDisc {
    // TODO: Implement your custom interface.
    int tracks;

    public CD(String name, Double storageCapacity, String discType, int spinSpeed, int tracks) {
        super(name, storageCapacity, discType, spinSpeed);
        this.tracks = tracks;
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
        System.out.println("Number of tracks: " + getTracks());
    }


    public int getTracks() {
        return tracks;
    }
}
