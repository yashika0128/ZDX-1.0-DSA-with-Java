package OOPs;

public class staticV {
    public static void main(String[] args) {
        demo3 s1 = new demo3("Khyati",19);
        demo3 s2 = new demo3("Pritam", 21);
        demo3 s3 = new demo3("Ayush", 22);

        // 3 ways fo assigning value
        //System.out.println(s1.name);

        //ideal -> Class property
//        s1.college = "GLA";
//        System.out.println(s1.college);
//        System.out.println(s2.college);

//        demo3.college = "GLA";
//        demo3.sec= "AA";
        System.out.println(s1.college);
        System.out.println(s2.college);
        System.out.println(s2.sec);
    }
}

class demo3{
   String name;
   int age;
   static String college; // this is no more an object property , it is now a class property classname.staticvariable
   static String sec;

   static void markAttendance(){
        System.out.println("You have marked attendence");
    }

    demo3(String name, int age){
        this.name = name;
        this.age = age;
    }

    static {
       college="GLA";
       sec = "AA";
    }
}
