// Program to check a given number is prime or not.
import java.util.Scanner;
public class prime{
    public static void main(String args[])
    {
        int flag=0,n=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        sc.close();
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("Prime");
        else
        System.out.println("Not Prime");
    }
}