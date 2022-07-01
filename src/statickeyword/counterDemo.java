package statickeyword;

public class counterDemo {
    static  int counter=0;
    counterDemo(){
        counter++;
        System.out.println(counter);
    }

    public static void main(String[] args) {
        counterDemo c1= new counterDemo();
        counterDemo c2= new counterDemo();
        counterDemo c3= new counterDemo();
        counterDemo c4=new counterDemo();
    }
}

