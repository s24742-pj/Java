public class Sedan extends Car implements Purchase {

    int length;

    public Sedan(int speed, double regularPrice, String color, int lenght){
        super(speed, regularPrice, color);
        this.length=lenght;
    }



    double getSalePrice(){

        if (length > 20)
            return super.getSalePrice() - (0.05 * super.getSalePrice());
        else
            return super.getSalePrice() - (0.1 * super.getSalePrice());

    }

    public String getPurchaseInfo(){

        return "SEDAN: "+ getSalePrice();
    }


}
