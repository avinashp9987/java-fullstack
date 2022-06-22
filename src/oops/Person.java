package oops;

import java.util.Scanner;

public class Person {
    int age;
    String name;
    String color;
    float height;

    void insertData(int ag, String nam, String col, float heigh) {
        age = age;
        name = name;
        color = color;
        height= height;
    }

    void display() {
        System.out.println("**** Student detail****");
        System.out.println("name" + name);
        System.out.println("age" + age);
        System.out.println("color"+color );
        System.out.println("height" + height);


    }
}

class StudentImpl {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age ");
        int age = sc.nextInt();
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter color");
        String color = sc.next();
        System.out.println("Enter height");
        float height = sc.nextFloat();

        Student s2 = new Student();
        s2.insertData(age,name, color, height);
        s2.display();

        Student s3= new Student();
        s3.insertData(1,"avinash","qwert",7.9f);
        s3.display();

    }
}


