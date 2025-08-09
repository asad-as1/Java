import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        sc.close();
        
        if(c == 7) 
        System.out.println("-1");

        else if(a == 7)
        System.out.println(b*c);

        else if(b == 7)
        System.out.println(c);

        else
        System.out.println(a*b*c);
    }
}
