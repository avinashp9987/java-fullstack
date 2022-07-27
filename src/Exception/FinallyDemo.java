package Exception;
// finally block always Executed whether exception occurs or not
public class FinallyDemo {
    public static void main(String[] args) {
        String msg = null;
        try{
            System.out.println(10/0);
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());

        }
            finally {
            System.out.println("in finally block");
        }
        System.out.println("Rest of code");
    }
}
