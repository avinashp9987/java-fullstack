package ControlFlowsStatement;

import java.util.Scanner;

public class CalculateorEx {
    public static void main(String[] args) {
        int no1, no2;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter no1");
        no1 = Scanner.nextInt();
        System.out.println("Enter no2");
        no2 = Scanner.nextInt();
        char ch;

        int choice;
        int result;
        do {
            System.out.println("1. Addition");
            System.out.println("2. substraction");
            System.out.println("3.multiplication");
            System.out.println("4. dividation");
            System.out.println("5.modulo");
            System.out.println("Enter your choice");
             choice = Scanner.nextInt();
            switch (choice) {
                case 1:
                    result = no1 + no2;
                    System.out.println("Addition is: " + result);
                    break;
                case 2:
                    result = no1 - no2;
                    System.out.println("substraction is :" + result);
                    break;
                case 3:
                    result = no1 * no2;
                    System.out.println("multiplication is :" + result);
                    break;
                case 4:
                    result = no1 / no2;
                    System.out.println("Dividation is :" + result);
                    break;
                case 5:
                    result = no1 % no2;
                    System.out.println("modulo is : " + result);
                    break;
                default:
                    System.out.println("Invalid input");

            }
            System.out.println("Do you want to continue?");
            ch = Scanner.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}

