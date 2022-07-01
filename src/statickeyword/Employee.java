package statickeyword;

public class Employee {
    int emNo;
    String empName;
    static String companyName;
    static void show(){
        companyName="codekul";
        //empName="Avi"     cant be called
    }
    void display(){
        companyName ="codekul";
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee.show();
        Employee e = new Employee();
        e.display();
    }
}
