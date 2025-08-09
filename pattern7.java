// Butterfly pattern.
import java.util.Scanner;
public class pattern7
{
    public static void main(String[] args)
    {
        System.out.print("Enter the numbers of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print("*");
            for(int j=1;j<=2*(n-i);j++)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print("*");
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            System.out.print("*");
            for(int j=1;j<=2*(n-i);j++)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print("*");
            System.out.println();
        }
    }
}/*for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*n;j++)
            {
                if(j>i && j<=2*n-(i))
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=2*n;j++)
            {
                if(j>i && j<=(2*n)-i)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        } */
