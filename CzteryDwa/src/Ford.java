public class Ford extends Car implements Purchase{

    int year;
    int manufacturerDiscount;


    public Ford(int speed, double regularPrice,String color, int year, int manufacturerDiscount){

        super(speed, regularPrice, color);
        this.year=year;
        this.manufacturerDiscount= manufacturerDiscount;


    }


    double getSalePrice() {
        double x=super.getSalePrice() - manufacturerDiscount;
        return x;
    }

    public String getPurchaseInfo() {
        return "FORD: "+getSalePrice();
    }

}
