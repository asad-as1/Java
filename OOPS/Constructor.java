// Constructor

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Asad");  // Initialization of our constructor
        Student s3 = new Student(101);

        System.out.println(s2.name);
        System.out.println(s3.roll);
        System.out.println(s1.sum);
    }
}

class Student {
    String name;
    int roll;
    int sum;

    // Types of Constructor  :-
    
    // 1:- Non-parameterized
    Student(){
        System.out.println("Constructor is called...");
    }
     
    // 2:- Parameterized
    Student(String name) {
        this.name = name;
        // int a = 10;
        // int b = 10;
        // sum = a + b;
    }
    Student(int roll){
        this.roll = roll;
    }
}
