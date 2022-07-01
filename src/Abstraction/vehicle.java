package Abstraction;

public abstract class vehicle {
    abstract void start();
    vehicle(){
        System.out.println("In vehicle constructor");
    }
    static void stop(){
        System.out.println("In show method");
    }
    void  drive(){
        System.out.println("In drive method");
    }
}
 class car extends vehicle{
    @Override
    void start() {
        System.out.println("in car start method");
    }
    void drive(){
        super.drive();
    }
    static void show(){
        System.out.println("in show method");
    }
}
class vehicleImpl{
    public static void main(String[] args) {
        vehicle v1= new car();
        v1.start();
        v1.drive();
        v1.stop();
    }
}

