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


        System.out.println("Na przejechanie 860km minivan potrzebuje " + miniVan.need() + " litrow paliwa");
        System.out.println("Na przejechanie 860km samochod sportowy potrzebuje " + sportCar.need() + " litrow paliwa");


    }

    }

