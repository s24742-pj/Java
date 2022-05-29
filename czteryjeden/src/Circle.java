public class Circle {

    protected double radius=1.0;
    private String color = "blue";

    public Circle() {

    }
    public Circle(double radius){
        this.radius=radius;


    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){

        return Math.PI * (radius*radius);
    }

    public String toString(){

        return "Kolor kola: "+color+" , i jego pole: "+getArea();


    }

}
