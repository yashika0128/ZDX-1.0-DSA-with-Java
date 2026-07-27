package OOPs;

public class demo2 {
    public static void main(String[] args) {
        animal a1 = new animal(4, "wild");
        a1.printAll();

        animal a2 = new animal(2,"flying");
        animal a3 = new animal("Female", "Wild");
        animal a4 = new animal(4, "Wild", 56,"Male");
    }
}

class animal{
    int num_of_legs;
    String type;
    int body_weight;
    String gender;

    animal(int num_of_legs, String type, int body_weight, String gender){
        this.num_of_legs = num_of_legs;
        this.type = type;
        this.body_weight = body_weight;
        this.gender = gender;
    }

    animal(String gender, String type){
        this.gender = gender;
        this.type = type;
    }

    animal(int num_of_legs, String type){
        this.num_of_legs = num_of_legs;
        this.type = type;
    }

    void printAll(){
        System.out.println(num_of_legs +" "+ type);
    }
}
