public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();  // First it will give preference to its methods
        // Output :- eats grass
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat() {
        System.out.println("eats grass");
    }
}
