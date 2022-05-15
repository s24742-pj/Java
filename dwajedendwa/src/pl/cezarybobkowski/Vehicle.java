package pl.cezarybobkowski;

public class Vehicle {

    private int passangers;
    private int fuelcap;
    private double lkm;


    public Vehicle(int passangers, int fuelcap, double lkm) {

        this.passangers = passangers;
        this.fuelcap = fuelcap;
        this.lkm = lkm;
    }

    public int getPassangers() {
        return passangers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public double getLkm() {
        return lkm;
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public void setLkm(double lkm) {
        this.lkm = lkm;
    }


}
