package Abstraction;

public  abstract class shape {
    abstract double calculateArea();
    void display(){
        System.out.println("calculating area of diff. shape");
    }
}
class Rectangle extends shape{
    int breath;
    int height;

    public Rectangle(int breath, int height) {
        this.breath = breath;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return  breath*height;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Area of rect."+calculateArea());
    }
}
class shapeImpl{
    public static void main(String[] args) {
        shape shape = new Rectangle(5,7);
        shape.display();
    }
}
