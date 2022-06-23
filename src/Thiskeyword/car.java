package Thiskeyword;

public class car {
    int carNo;
    String carName;
    double price;
    car(int carNo,String carName,double price){
        this.carNo = carNo;
        this.carName=carName;
        this.price=price;

    }
    void display(){
        System.out.println("car Details");
        System.out.println("car No:"+carNo);
        System.out.println("carName"+carName);
        System.out.println("price:"+price);
    }
}
class carImpl{
    public static void main(String[] args) {
        car c1= new car(101,"swift",850000);
        c1.display();
    }
}
