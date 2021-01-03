public class Su27 extends  Plane implements  ISpesificAbilities{

    Su27(double wid,double len, double wei){
        wid = this.widthOfPlane;
        len = this.lenghtofPlane;
        wei = this.weightOfPlane;
    }

    @Override
    public void turboBoost() {
        System.out.println("TurboBoost is on! Plus "+randomValue(1,100)+"km/h");
    }

    @Override
    public void stelsTecknology() {
        System.out.println("The plane has been hiden for "+randomValue(10,60)+"minutes");

    }

    @Override
    public void nuclearStrike() {
        System.out.println("The" + randomValue(0,10)+" nuclear bombs would be dropped ");

    }
}


