public class GetterSetter {
    public static void main(String[] args){
        Pen p1 = new Pen();

        p1.setColor("Green");
        p1.setTip(5);

        System.out.println("Color : " + p1.getColor());
        System.out.println("Tip : " + p1.getTip());
    }
}

class Pen{
    private String color;
    private int tip;
     
    // Getter
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    
    // Setter
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}
