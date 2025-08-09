public class ShallowDeepCopy{
    public static void main(String... args){
        Student s1 = new Student();
        s1.name = "Asad";
        s1.password = "asad";
        s1.marks[0] = 80;
        s1.marks[1] = 90;
        s1.marks[2] = 60;
        
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i=0; i<3; i++) {
            System.out.print(s2.marks[i] + " ");
        }

    }
} 
class Student{
    String name;
    String password;
    int roll;
    int marks[];
    
    // Shallow Copy constructor   //changes occur in s2
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks; 
    // }
    
    // Deep Copy constructor  // it copy the whole marks in different array;
       Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student () {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }
}