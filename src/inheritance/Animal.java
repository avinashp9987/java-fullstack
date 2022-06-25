package inheritance;

//Multilevel Inheritance


public class Animal {
    void eat() {
        System.out.println("Animal can eat anything");
    }
}

class Dog extends Animal {
    void run() {
        System.out.println("Dog run anywhere");
    }
}

class BabyDog extends Dog {
    void sleep() {
        System.out.println("BabyDog sleep @ Night");
    }
}

class AnimalImpl {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.sleep();
        babyDog.eat();
        babyDog.run();
    }
}
