public class A {
    public static void main(String[] args){
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // h.changeColor();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang
    }
}

abstract class Animal {
   String color;
   
   // Constructor of abstract class
   Animal() {
    color = "brown";
    System.out.println("animal contructor called...");
   }

    void eat() {
        System.out.println("animals eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called...");
    }

    void changeColor() {
        color = "White";
    }

    void walk()
    {
        System.out.println("walks on 4 leg");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("horse constructor called...");
    }

    void changeColor() {
        color = "Grey";
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called...");
    }
}