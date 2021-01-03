import java.util.Random;

public abstract class Plane extends PlaneControl {


    double weightOfPlane;
    double lenghtofPlane;
    double widthOfPlane;






    void startEngine(){
        System.out.println("There are " + randomValue(20,88)+"minutes before the start");
    }

    void  risePlane(){
        System.out.println("The plane will fly "+randomValue(0,1000)+"km");
    }

    void  landingPlane(){
        System.out.println("The plane is going to land");

    }




}
