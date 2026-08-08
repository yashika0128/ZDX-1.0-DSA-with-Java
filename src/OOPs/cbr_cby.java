package OOPs;

public class cbr_cby {

    // call by value
    public static void main(String[] args) {
        int x =10;
        add2(x); // 10+2
        //System.out.println(x); //12

        d3 c1 = new d3(19,"GLAU");
        add2(c1);

        System.out.println(c1.age);
    }

    public static void add2(int x){
        x+=2;
        //System.out.println(x);
    }

    public static void add2(d3 d){

        d.age += 2;
    }

    // call by reference
}

class d3{
    int age;
    String college;

    d3(int age, String college){
        this.age = age;
        this.college = college;
    }
}