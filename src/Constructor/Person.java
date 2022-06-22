package Constructor;

public class Person {
    int id;
    String name;
    String adress;
    Person(int i,String nm){
        id = i;
        name= nm;
    }
    Person(){
        System.out.println("Default constructor");
    }
    Person(String nm){
        name =nm;

    }
    void display(){
        System.out.println("Id"+id);
        System.out.println("name :"+name);
    }
}
class Personimpl{
    public static void main(String[] args) {
        Person p1 = new Person(5,"zen");
        p1.display();
        Person p2=new Person();
        Person p3=new Person("john");
        p3.display();
    }
}