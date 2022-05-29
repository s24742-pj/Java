public class Circle {

    private double radius;

    private String color;


    public Circle() {

        radius=5;
        color="Czarny";

    }

    public Circle(double radius) {


        this.radius = radius;
        color="Czarny";


    }

    public Circle(double radius, String color) {

        this.radius = radius;
        this.color = color;


    }


    public void setRadius(double radius){

        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {

        return radius();
    }

    private double radius() {
    this.radius= radius;
        return radius;
    }


    public double getArea(){
        return Math.PI*(radius*radius);
    }
    
    
    public String toString(){
        String infoCircle = "Promien kola= "+this.radius+ " , Pole kola= "+getArea()+" ,Kolor kola: "+this.color;


        return infoCircle;
    }





}
