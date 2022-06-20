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
//        for (int i=1;i<6;i++){
//            for (int j=6;j>i;j--){
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++){
//                System.out.print
//                        (" * ");
//            }
//            System.out.println("");
//        }


//        int n =5;
//        for(int i=1;i<=n;i++){
//            for (int j=i;j<=n;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//
//        for (int i=1;i<=4;i++){
//            for( int j=1;j<=1;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }


////
////        for (int i=1;i<=4;i++){
////            for( int j=1;j<=i;j++){
////                System.out.print(" * ");
////            }
////            System.out.println();
////        }
////        for(int i=1;i<=4;i++){
////            for( int j=4;j>=i;j--){
////                System.out.print(" * ");
////            }
////            System.out.println();
//        }


        for( int i=1;i<=4;i++){
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

