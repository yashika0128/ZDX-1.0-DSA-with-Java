package OOPs;

public class demo1 {
    public static void main(String[] args) {
        employee e1 = new employee("Yashika",19,24512,"Google");
        e1.printAll();
    }
}

class employee{
    String name;
    int age;
    int id;
    String company;


    void printAll(){
        System.out.println(name+" "+age+" "+id+" "+company);
    }

    employee(String name, int age, int id, String college){
        name = name;  // 5=5
        age = age;
        id = id;
        company = company;
    }
}
