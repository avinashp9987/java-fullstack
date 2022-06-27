package inheritance;

public class Area {

        String area;
    }

    class reactAngle extends Area {
         int l =30;
         int b =10;
         double Area =l*b;

    }

    class circle extends Area {
         int r =6;
        double Area = 3.14*(r^2);
    }

    class square extends Area {
         int a =20;
        double Area = (a^2);
    }
    class Triangle extends Area {
        int l = 20;
        int b = 10;
        int h = 5;
        double Area = l * b * h;

    }
    class AreaImpl {
        public static void main(String[] args) {
            Triangle triangle = new Triangle() ;
            square square = new square();
            circle circle = new circle();
            reactAngle reactAngle= new reactAngle();
            System.out.println("area of triangle"+triangle.area);
            System.out.println("area of rectangle"+reactAngle.area);
            System.out.println("area of circle"+circle.area);
            System.out.println("area of square"+square.area);

            double total = triangle.Area+ square.Area + circle.Area+reactAngle.Area;
            System.out.println(total);

        }
    }

