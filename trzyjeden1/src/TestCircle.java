public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        Circle c2 = new Circle(20);

        Circle c3 = new Circle(30,"Fioletowy");

        Circle c4 = new Circle();
        c4.setRadius(40);
        c4.setColor("Zielony");


        String radius;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);



    }
}