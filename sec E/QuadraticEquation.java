import java.util.Scanner;
class QuadraticEquation {
public static void main(String[] args) 
{
    Scanner sc =  new Scanner(System.in);
    int a = 0, b = 0, c = 0;
    double d = 0;
    System.out.print("Enter the value of a: ");
    a = sc.nextInt();

    System.out.print("Enter the vsalue of b: ");
    b = sc.nextInt();

    System.out.print("Enter the vsalue of c: ");
    c = sc.nextInt();
    sc.close();

    d = (b*b) - 4*a*c;

    if(d < 0)
    System.out.println("The equation has no real roots");
    else if(d > 0)
    {
        System.out.println("The first root is: " +(-b + d)/2*a);
        System.out.println("The second root is: "+(-b - d)/2*a);
    }
    else if(d == 0)
    {
        System.out.println("The root is: " +(-b + d)/2*a);
    }
}
}