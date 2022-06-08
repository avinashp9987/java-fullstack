//Types of variables:
//1. local -scope of local variable are within function only
//2. instance - within a class but outside the method
//3. static - within a class but outside the method, cannot be local


public class variables {


        int z = 30; //instance variables

        static int c = 50; //static variables

    public static void main(String[] args) {
        int a = 10; // Lpcal variables
        System.out.println(a);
        System.out.println(a+c);
        System.out.println(c);
    }

    void display(){
        int a =20; // Local variables
        System.out.println(a);
        System.out.println(c);
        System.out.println(z);
    }
}

