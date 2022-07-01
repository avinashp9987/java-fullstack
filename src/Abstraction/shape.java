package Abstraction;

import java.awt.*;

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
        System.out.println("Area of Triangle"+calculateArea());
        }

    }

class shapeImpl{
    public static void main(String[] args) {
        shape shape = new Rectangle(5,6);
        shape shape1 = new Triangle(5,6,7);
        shape.display();
    }
}
class Triangle extends shape{
    int l;
    int b;
    int h;

    public Triangle(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    @Override
    double calculateArea() {
        return l*b*h;
    }
}