package association;

public class vehicle {
    int wheels;
    String vehicleType;
    String brand;

}

class  car extends vehicle{
    String segment;
    String model;
    String varient;
    Engine engine;
    Mplayer mplayer;
void display(){
    System.out.println();
}

}
class Engine{
    int stroke;
    String engineType;
    int cc;
}
class Mplayer{
    String companyName;
    double prce;
}
class vehicleImpl{
    public static void main(String[] args) {
        car car = new car();
        car.brand="Suzuki";
        car.vehicleType="car";
        car.model="Swift";
        car.segment ="Hashback";
        car.varient="Diesel";
        Engine SuzukiEngine= new Engine();
        SuzukiEngine.engineType="Bs6";
        SuzukiEngine.cc =1296;
        SuzukiEngine.stroke=4;
        car.engine=SuzukiEngine;
        Mplayer sonyPlayer=new Mplayer();
        sonyPlayer.companyName="sony";
        sonyPlayer.prce=3400;
        car.mplayer=sonyPlayer;

    }
}