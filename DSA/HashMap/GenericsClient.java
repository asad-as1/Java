// Angular brackets -> means belong to Generics class

public class GenericsClient {
    public static void main(String[] args) {
        GenericsDemo<String> gd = new GenericsDemo<String>();
        gd.a = "hello world";
        System.out.println(gd.a);

        // int arr[] = {1, 2, 3};   
        Integer arr[] = {1, 2, 3};   // use wrapper class

        String arr1[] = {"abc", "def"};

        // gd.display(arr);
        gd.display(arr1);
    }
}