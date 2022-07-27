package Exception;

public class ArrayIndex {
    public static void main(String[] args) {

        String  a = "Avii";
        System.out.println(a.toLowerCase());

        int c[] ={1,2,3,4,5};
        try {
            System.out.println(c[1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
