public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum(1.5f,2.5f));
        System.out.println(cal.sum(1,2, 3));
    }
} 

class Calculator {

    int sum(int x, int y) {
        return x + y;
    }

    float sum(float x, float y) {
        return x + y;
    }
    
    int sum(int x, int y, int z) {
        return x + y + z;
    }
}