package oops;

import javax.swing.plaf.basic.BasicMenuItemUI;
import java.util.Scanner;

public class Student {
    int rno;
    String name;
    String address;
    float age;

    void insertData(int r, String nm, String addr, float a) {
        rno = r;
        name = nm;
        address = addr;
        age = a;
    }

    void display() {
        System.out.println("**** Student detail****");
        System.out.println("name" + name);
        System.out.println("rno" + rno);
        System.out.println("addr" + address);
        System.out.println("a" + age);


    }
}

class StudentImpl1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rno = 1;
        s1.name = "Amit";
        s1.address = "kothrud pune";
        s1.age = 5.3f;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rno ");
        int rno = sc.nextInt();
        System.out.println("Enter nm");
        String nm = sc.next();
        System.out.println("Enter address");
        String addr = sc.next();
        System.out.println("Enter age");
        float a = sc.nextFloat();


        Student s2 = new Student();
        s2.insertData(rno, nm, addr, a);
        s2.display();

        Student s3= new Student();
        s3.insertData(1,"avinash","qwert",7.9f);
        s3.display();

    }
}

