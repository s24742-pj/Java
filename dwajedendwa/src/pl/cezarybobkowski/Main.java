package pl.cezarybobkowski;

public class Main {

    public static void main(String[] args) {

        int rangeV;
        int rangeC;

        Vehicle miniVan = new Vehicle(7, 78, 7.4);
        Vehicle sportCar = new Vehicle(2, 65, 13.2);


        miniVan.setPassangers(7);
        miniVan.setFuelcap(78);
        miniVan.setLkm(7.4);

        sportCar.setPassangers(2);
        sportCar.setFuelcap(65);
        sportCar.setLkm(13.2);


        rangeV = (int) (miniVan.getFuelcap() / miniVan.getLkm() * 100);
        rangeC = (int) (sportCar.getFuelcap() / sportCar.getLkm() * 100);

        
        System.out.println("minivan przewozi " + miniVan.getPassangers() + " osob.");
        System.out.println("Zasieg (km): " + rangeV);
        System.out.println("Sportowe auto przewozi " + sportCar.getPassangers() + " osoby.");
        System.out.println("Zasieg (km): " + rangeC);


    }
}
