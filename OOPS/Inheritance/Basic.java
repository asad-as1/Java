public class Basic {
    public static void main(String[] args)
    {
        Fish f1 = new Fish();
        f1.eat();
    }
}

// Parent(Base) Class
class Animals {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Child(Derived) Class
class Fish extends Animals {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}