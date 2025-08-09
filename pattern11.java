// Diamond pattern.
import java.util.Scanner;
public class pattern11
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");
            for(int j=1;j<=(2*i)-1;j++)
            System.out.print("*");
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");
            for(int j=1;j<=(2*i)-1;j++)
            System.out.print("*");
            System.out.println();
        }
    }
}
/*for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+i-1;j++)
            {
                if(j<=n-i)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n+i-1;j++)
            {
                if(j<=n-i)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        } */
