package pl.cezarybobkowski;

public class Main {

    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(7, 78, 7.4);
        Vehicle sportCar = new Vehicle(2, 65, 13.2);


        System.out.println("minivan przewozi " + miniVan.passangers + " osob na odleglosc do " + miniVan.fuelcap / miniVan.lkm * 100 + "kilometorw");
        System.out.println("Sportowe auto przewozi " + sportCar.passangers + " osoby na odleglosc do " + sportCar.fuelcap / sportCar.lkm * 100 + "kilometorw");



    }
}
