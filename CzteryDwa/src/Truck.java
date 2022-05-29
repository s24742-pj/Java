public class Truck extends Car implements Purchase {

    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }


    double getSalePrice() {
        if (weight > 2000)
            return super.getSalePrice() - (super.getSalePrice() * 0.1);
        else
            return super.getSalePrice();


    }

    public String getPurchaseInfo() {
        return "TRUCK: " + getSalePrice();
    }
}