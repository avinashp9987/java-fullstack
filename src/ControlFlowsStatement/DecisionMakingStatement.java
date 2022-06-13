package ControlFlowsStatement;

public class DecisionMakingStatement {
    public static void main(String[] args) {
        String city = "pune";
        if(city=="pune") {
            System.out.println("you are from pune");
        }
        else{
            System.out.println("you are from mumbai");
        }
        if ( city == "mumbai")
            System.out.println("you are from mumbai");
        else if (city == "goa")
            System.out.println("you are from goa");
        else
            System.out.println("you are from pune");

        String country = "india";
        if (country=="india")
        {
            if (city=="pune")
            {
                System.out.println("pune is in india");
            }
            else{
                System.out.println("mumbai is in india");
            }
        }
        else{
            System.out.println("you are in other country");
        }
    }

    }

