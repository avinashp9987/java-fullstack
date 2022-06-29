
// To invoke parent class method

package superkeyword;

public class Animal {
    void eat(){
        System.out.println("eating...*");
    }
}
class Dog extends Animal{
    void run(){
        super.eat();
        System.out.println("running");
    }
}
class AnimalImpl{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
    }
}
