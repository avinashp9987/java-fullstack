package ControlFlowsStatement;

import java.util.Scanner;

public class PrimeNoEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            } else {
                flag = true;
            }

        }
        if (flag) {

            System.out.println("Enter no" + n + "is  prime");
        } else {
            System.out.println("Enter no" + n + "is not prime");
        }
    }
}
