import java.util.Random;

public class PlaneControl  {

    int  randomValue(int a, int b){
        Random r = new Random();
        int low = a;
        int high = b;
        int result = r.nextInt(high-low) + low;
        return result;
    }

    void planeIsGoingUp(){
        System.out.println("Plane is going up at "+ randomValue(1,10) + "km");
    }

    void planeIsGoingDown(){
        System.out.println("Plane is going down at "+ randomValue(1,10) + "km");
    }

    void planeIsGoingRight(){
        System.out.println("Plane is going right at "+ randomValue(1,10) + "km");
    }

    void planeIsGoingLeft(){
        System.out.println("Plane is going left at "+ randomValue(1,10) + "km");
    }
}
