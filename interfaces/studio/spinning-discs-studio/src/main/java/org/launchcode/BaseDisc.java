package org.launchcode;

public abstract class BaseDisc implements OptimalDisc {
    //declare fields used by extended classes
    // properties of a disc: storage space, spin speed, name, disc type
    private String name;
    private Double storageCapacity;
    private String discType;
    private int spinSpeed;


//    SHARED CODE
//    constructors
    public BaseDisc(String name, Double storageCapacity, String discType, int spinSpeed) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
        this.spinSpeed = spinSpeed;
    }


//    getters
    public String getName() {
        return name;
    }

    public Double getStorageCapacity() {
        return storageCapacity;
    }

    public String getDiscType() {
        return discType;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }


    //    setters : constructor sets properties already
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setStorageCapacity(Double storageCapacity) {
//        this.storageCapacity = storageCapacity;
//    }
//
//    public void setDiscType(String discType) {
//        this.discType = discType;
//    }
//
//    public void setSpinSpeed(int spinSpeed) {
//        this.spinSpeed = spinSpeed;
//    }

//    custom methods

}
