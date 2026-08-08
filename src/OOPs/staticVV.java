package OOPs;

public class staticVV {
    public static void main(String[] args) {
        demooStudent s1 =  new demooStudent("Ayush", 19,2);

        // object ke refernce variable ke through excess kr skti hu (This is bad thing)
        //s1.college = "XYZ";

        // Class ke through access krke value assign krdo (Good if you want to access)
        //demooStudent.college = "XYZ";

        //System.out.println(s1.college);
        System.out.println(demooStudent.college);

       // s1.markAtte();
        demooStudent.markAtte();
    }
}

class demooStudent{
    String name;
    int age;
    static String college;
    int roll_no ;

    static void markAtte(){
        System.out.println("Hey!! You have marked your attendance");
    }

    // Constructor to initialize our instance variables

    demooStudent(String name, int age, int roll_no){
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }


    // Static block ka use krke static variable to values assign ki jati hain
    static {
        college = "XYZ";
    }
}
