package inheritance;

public class student {
    String name = "xyz";
    int rno = 1;
    String div = "8";
}

class physicsMarks extends student {
    double marks = 78;
}

class chemistryMarks extends student {
    double marks = 85;
}

class matheMarks extends student {
    double marks = 90;
}

class studentImpl {
    public static void main(String[] args) {
        matheMarks matheMarks = new matheMarks();
        chemistryMarks chemistryMarks = new chemistryMarks();
        physicsMarks physicsMarks = new physicsMarks();

        double total = matheMarks.marks + chemistryMarks.marks + physicsMarks.marks;
        double percentage = (total / 300) * 100;
        System.out.println("****student name*****");
        System.out.println("Roll No" + matheMarks.rno);
        System.out.println("Name" + matheMarks.name);
        System.out.println("Div" + matheMarks.div);
        System.out.println("percentage" + percentage);
    }
}