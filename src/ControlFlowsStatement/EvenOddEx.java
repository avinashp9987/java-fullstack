package ControlFlowsStatement;

import java.util.Scanner;

public class EvenOddEx {
    public static void main(String[] args) {
        int number,reminder;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number");
        number = input.nextInt();
        input.close();

        reminder = number % 2 ;
        if(reminder==0)
            System.out.printf("%d is Even number",number);
        else
            System.out.printf("%d is odd number",number);
    }
}
