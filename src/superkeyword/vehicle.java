package superkeyword;

public class vehicle {
    int vehicleCode;
    String vehicleType;

    public vehicle(int vehicleCode, String vehicleType) {
        this.vehicleCode = vehicleCode;
        this.vehicleType = vehicleType;

    }


}

class Bike extends vehicle {
    String bikeName;
    String brand;
    String model;



    public Bike(int vehicleCode, String vehicleType, String bikeName, String brand, String model) {
        super(vehicleCode, vehicleType);
        this.bikeName = bikeName;
        this.brand = brand;
        this.model = model;

    }

    void display() {
        System.out.println("vehicleCode" + super.vehicleCode);
        System.out.println("vehicleType" + super.vehicleType);
        System.out.println("model" + model);
        System.out.println("Brand" + brand);
        System.out.println("bikeName" + bikeName);
    }
}

class vehicleImpl {
    public static void main(String[] args) {
        Bike bike = new Bike(101, "Bike", "unicorn", "Honda", "150cc");
        bike.display();
    }
}