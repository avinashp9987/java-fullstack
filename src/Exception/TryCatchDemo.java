package Exception;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        int a;
        int b;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            result = a/b;
            System.out.println("4");
            System.out.println("5");

        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("result"+result);
        System.out.println("Rest of the code");
    }
}
