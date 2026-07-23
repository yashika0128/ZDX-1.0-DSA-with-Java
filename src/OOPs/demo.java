package OOPs;

public class demo {
    public static void main(String[] args){
        Student Pritam = new Student("Pritam",23,73,"PU");
        // dot operator

//        Pritam.name = "Pritam";
//        Pritam.age = 23;
//        Pritam.college = "PU";
//        Pritam.roll_no = 73;

//        System.out.println(Pritam.name);   // Pritam
//        System.out.println(Pritam.age);  // 23
//        System.out.println(Pritam.college);  //PU
//        System.out.println(Pritam.roll_no);  // 73
        Pritam.printAll();

        //Pritam.markAttendance();
        //Pritam.givesExam();

        Student Khyati =  new Student("Khyati", 18,42,"GLAU");
        //Khyati.assignValues("Khyati",18,42,"GLAU");
        Khyati.printAll();

        //Local variables need to be initialized by the user before using it, because JAVA only assigns instance variables with default values
//        int x;
//        //x=5;
//        System.out.println(x);

    }
}

class Student{

    // characteristics
    String name;
    int age;
    int roll_no;
    String college;

    // Behaviour

    void markAttendance (){
        int y=5; // local variable
        System.out.println(name+" has marked attendance.");
    }

    void givesExam(){
        System.out.println(name+" "+ roll_no+ " has appeared for exam.");
    }

    // Methods for our ease

    // this assignvalue method, assigns value after the object is created, we want to assign values while object is being created
//    void assignValues(String n, int a, int r, String c){
//        name = n;
//        age = a;
//        roll_no = r;
//        college = c;
//    }



    Student(String n, int a, int r, String c){
        name = n;
        age = a;
        roll_no = r;
        college = c;
    }


    void printAll(){
        System.out.println(name +" "+ age+" "+roll_no+" "+college);
    }
}

