public class TestCircleAndCylinder {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Circle circle2 = new Circle(9);


        System.out.println(circle.toString());
        System.out.println(circle2.toString());


        Cylinder cylinder = new Cylinder();
        Cylinder cylinder2 = new Cylinder(7);
        Cylinder cylinder3 = new Cylinder(7,12);

        System.out.println("Objetosc Cylindra: "+cylinder.getVolume());
        System.out.println("Obetosc Cylindra2: "+cylinder2.getVolume());
        System.out.println("Objetosc Cylindra3:"+cylinder3.getVolume());












    }
}