package ControlFlowsStatement;


import java.util.Scanner;

public class star {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of stars you want :");
//        int a= sc.nextInt();
//        for (int i=1;i<a;i++){
//            for (int j=0;j<i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of stars you want :");
//        int a= sc.nextInt();
        for (int i=1;i<6;i++){
            for (int j=6;j>i;j--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}

