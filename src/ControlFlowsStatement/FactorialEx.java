package ControlFlowsStatement;

public class FactorialEx {
    public static void main(String[] args) {
        int n=3;
        int fact =1 ,i;
        for(i=2; i<=n; i++){
            fact =fact * i;
        }
        System.out.println(fact);
    }
}
