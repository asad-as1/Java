public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.schoolName = "GLA";  //then all students has same school name.

        s1.setName("GLA");  //then all students has different school name because of 'this' keyword.

        Student s2 = new Student();
        s2.setName("GLA2");
        System.out.println(s2.getName());

        System.out.println(s1.getName());
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
