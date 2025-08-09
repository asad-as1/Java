public class Hierarchical {
    public static void main(String[] args) {
        Mammal human = new Mammal();
        human.walk();

        Bird sparrow = new Bird();
        sparrow.fly();

        Fish shark = new Fish();
        shark.swim();
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
    void walk() {
        System.out.println("Mammal walks");
    }
}

class Fish extends Animals {
    void swim() {
        System.out.println("Fish swim");
    }
}

class Bird extends Animals {
    void fly() {
        System.out.println("Bird fly");
    }
}