public class operators {
    public static void main(String[] args) {
        int a = 30;
        boolean flag = false;
        System.out.println(a++); //30
        System.out.println(--a); //30
        System.out.println(++a);//31
        System.out.println(a--);//31

        System.out.println(~a);// (-a)-1 = -30-1 =-31


        System.out.println(!flag);

        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println(x + y);//30;
        System.out.println(y-x);//10
        System.out.println(x+z);//300
        System.out.println(z/x);//3
        System.out.println(z%x);//0


        System.out.println(x<<2);//10*2^2=40
        System.out.println(x<<2);//10*2^2=80
        System.out.println(x>>2);//10/2^2=2
        System.out.println(x>>2);//10/2^2=





        //logical & Bitwise operator

        System.out.println(x<y && y>z);
        System.out.println(x<y & y>z);
        System.out.println(z<y || y>x);
        System.out.println(z<y | y>x);


        //Ternary operator
        System.out.println(x>y ? "x is max":"y is max");

        if (x>y){
            System.out.println("x is maximum");
        }
        else{
            System.out.println("y is maximum");
        }
    }
}
