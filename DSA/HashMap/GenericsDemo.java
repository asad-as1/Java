import java.util.Arrays;

public class GenericsDemo <T> {
    T a;

    public<T> void display(T arr[]) {
        for(T el: arr) {
            System.out.print(el + " ");
        }
    }
}
