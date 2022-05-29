public class AutoShop {
    public static void main(String[] args) {

        Ford ford= new Ford(200,30000,"Czarny",2005,10);
        Ford ford2= new Ford(130,6752,"Zolty",2001,5);
        Sedan sedan = new Sedan(23,40000,"Bialy",7);
        Truck truck = new Truck (200, 60000, "Fioletowy", 6000);


        System.out.println(sedan.getPurchaseInfo());
        System.out.println(ford.getPurchaseInfo());
        System.out.println(ford2.getPurchaseInfo());
        System.out.println(truck.getPurchaseInfo());








    }
}