import java.util.Scanner;
public class functionFactorial
{
    public static int fact(int x)
    {
        int mul=1,i;
        for(i=1;i<=x;i++)
        mul=mul*i;
        return mul;
    } 
    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println("Factorial = "+fact(a));
    }
}
