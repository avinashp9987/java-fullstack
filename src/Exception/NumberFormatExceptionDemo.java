
 //Number Format Exception

package Exception;

public class NumberFormatExceptionDemo extends Throwable {
    public static void main(String[] args) {

        String n ="101A";
        int i = Integer.parseInt(n);
        System.out.println(i+5);
    }
}
