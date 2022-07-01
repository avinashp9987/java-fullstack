package statickeyword;

public class student {
    int rno;
    String name;
   static String schoolName;

   void display(){
       System.out.println(rno+":"+name+":"+schoolName+":");
   }

//    public student() {
//        this.rno = rno;
//        this.name = name;
    }

class studentImpl{
    public static void main(String[] args) {
        student s1 =new student();
        s1.name="Amit";
        s1.rno=2;
        s1.schoolName="JJ";

        student s2 =new student();
        s2.name="Shreyas";
        s2.rno=4;
        s2.schoolName="RJ";

        student s3 =new student();
        s3.name="vipul";
        s3.rno=3;
        s3.schoolName="sJ";
        s1.display();
        s2.display();
        s3.display();

    }
}
