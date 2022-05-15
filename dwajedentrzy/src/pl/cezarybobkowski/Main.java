package pl.cezarybobkowski;

public class Main {

    public static void main(String[] args) {



        Vehicle miniVan = new Vehicle(7, 78, 7.4);
        Vehicle sportCar = new Vehicle(2, 65, 13.2);


        miniVan.setPassangers(7);
        miniVan.setFuelcap(78);
        miniVan.setLkm(7.4);

        sportCar.setPassangers(2);
        sportCar.setFuelcap(65);
        sportCar.setLkm(13.2);




        System.out.println("minivan przewozi " + miniVan.getPassangers() + " osob na odleglosc do " + miniVan.range() + " kilometorw");
        System.out.println("Sportowe auto przewozi " + sportCar.getPassangers() + " osoby na odleglosc do " + sportCar.range() + " kilometorw");





    }
}
