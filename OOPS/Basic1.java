public class Basic1{
    public static void main(String[] args) // static :- access specifier
    {
        Pen p1 = new Pen();  // Pen() :- Constructor
    
    /*  Method 1 to change the color
        p1.setColor("Blue");  
        p1.setTip(5);            */

        // Method 2 to change the color
        p1.color = "Yellow";
        p1.tip = 6;

        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}