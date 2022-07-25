package Exception;

import java.io.File;


public class IoException{
    public static void main(String[] args) {
        File file =new File("abc.txt");

        //Io exception
       //file.createNewFile(); //checked / compile exception
    }
}
