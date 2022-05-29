public class Cylinder extends Circle {


    private double height = 4.0;



    public Cylinder(){




    }
        public Cylinder(double radius){
        this.radius=radius;



        }

    public Cylinder(double radius,double height){
       this.height=height;
       this.radius=radius;


    }

    public double getHeight() {
        return height;
    }


    public double getVolume(){

        return getArea()*getHeight();
    }

}
