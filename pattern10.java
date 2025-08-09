//Hollow rhombus.
import java.util.Scanner;
public class pattern10
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)                       // n=5
            System.out.print(" ");                    //            *****
            for(int j=1;j<=n;j++)                       //           *    *
            {                                           //          *    *
            if(i==1||i==n||j==1||j==n)                 //          *    *
            System.out.print("*");                  //          *****    
            else
            System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(2*n)-i;j++)
            {
                if(j<=n-i)
                System.out.print(" ");
                else
                {
                    if(i==1 || i==n || j==n-i+1 || j==(2*n)-i)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
            }
            System.out.println();
        } */