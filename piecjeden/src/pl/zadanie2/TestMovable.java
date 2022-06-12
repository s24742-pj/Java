package pl.zadanie2;
public class TestMovable {
    public static  void main(String[] args){
        MovablePoint movablePoint=new MovablePoint(5,7);
        System.out.println(movablePoint.toString());


        movablePoint.moveUp();
        System.out.println("W gore " + movablePoint.toString());

        movablePoint.moveDown();
        System.out.println("W dol "+ movablePoint.toString());

        movablePoint.moveLeft();
        System.out.println("W lewo "+ movablePoint.toString());

        movablePoint.moveRight();
        System.out.println("W prawo "+ movablePoint.toString());






    }



}
