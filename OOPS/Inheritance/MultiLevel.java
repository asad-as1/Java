public class MultiLevel {
    public static void main(String[] args) {
         Dog dobby = new Dog();
         dobby.eat();
         dobby.legs = 4;
         System.out.println(dobby.legs);
    }
}

class Animals {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animals {
    int legs;
}

class Dog extends Mammal {
    String breed;
}
