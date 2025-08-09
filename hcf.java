// Program to find the HCF or GCD of two numbers.
import java.util.Scanner;
public class hcf
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a==0 || b==0)
        System.out.println(0);
        else if(a==1 || b==1)
        System.out.println(1);
        else
        {
        while(a!=0 && b!=0)
        {
            if(a > b) a = a % b;  // Important;
            else b = b % a;
        }
        int max=Math.max(a,b);
        System.out.println("Hcf = "+max);
        }
        
    }
}
