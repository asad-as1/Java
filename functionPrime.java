import java.util.Scanner;
public class functionPrime
{
    public static void prime(int n)
    {
        int count =0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            count++;
        }
        if(n>1)
        {
        if(count>0)
        System.out.print("Not prime");
        else
        System.out.print("Prime");
        } 
        else
        System.out.print("Not prime");
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        prime(a);
    }
}
