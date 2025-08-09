import java.util.Scanner;
public class functionGcd
{
    /**
     * @param a
     * @param b
     */
    public static void gcd(int a,int b)
    {
        int min,hcf=0;
        if(a>b)
        min=b;
        else
        min=a;
        for(int i=min;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
               hcf=i;
               break;
            }
        }
        System.out.print("Hcf = "+hcf);
    }
    public static void main(String[] args)
    {
        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        gcd(a,b);
    }
}
