package Thiskeyword;

public class Bike {
    int bikeNo;
    String bikeName;

    public Bike(){
        this(103,"Bullet 350");
    }

    public Bike(int bikeNo,String bikeName){
        System.out.println("in parametarised constructor");
        this.bikeNo = bikeNo;
        this.bikeName =bikeName;
    }
    void display(){
        System.out.println("Bike Details");
        System.out.println("Bike No:"+bikeNo);
        System.out.println("Bike Name"+bikeName);
    }
}
class BikeImpl{
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.display();
    }
}
