import java.util.Scanner;
public class functionMul
{
    public static int mul(int x,int y)
    {
        return x*y;
    }
    public static void main(String[] args)
    {
        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Multiplication ="+mul(a,b));
    }
}
