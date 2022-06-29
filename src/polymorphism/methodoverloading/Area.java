package polymorphism.methodoverloading;

public class Area {
    double getArea() {
        int r = 2;
        return (3.14 * r * r);
    }
}

class Triangle extends Area {
    double getArea() {
        int l = 2;
        int b = 20;
        int h = 10;
        return (l * b * h);
    }
}

class rectangle extends Area {
    double getArea() {
        int l = 20;
        int b = 40;
        return (l * b);
    }
}

class Square extends Area {
    double getArea() {
        int a = 20;
        return (a ^ 2);
    }
}

class AreaImpl {
    public static void main(String[] args) {
        Area area;
        area = new Triangle();
        System.out.println(area.getArea());
        area = new rectangle();
        System.out.println(area.getArea());
        area = new Square();
        System.out.println(area.getArea());
        area = new Area();
        System.out.println(area.getArea());
    }
}
